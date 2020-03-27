{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module Barcodable.com.API
  -- * Client and Server
  ( Config(..)
  , Barcodable.comBackend(..)
  , createBarcodable.comClient
  , runBarcodable.comServer
  , runBarcodable.comMiddlewareServer
  , runBarcodable.comClient
  , runBarcodable.comClientWithManager
  , callBarcodable.com
  , Barcodable.comClient
  , Barcodable.comClientError(..)
  -- ** Servant
  , Barcodable.comAPI
  ) where

import           Barcodable.com.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serve)
import           Servant.API
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList


-- | Servant type-level API, generated from the OpenAPI spec for Barcodable.com.
type Barcodable.comAPI
    =    "api" :> "v1" :> "convert" :> Capture "upc | ean | asin" Text :> Verb 'GET 200 '[JSON] InlineResponse200 -- 'convertCode' route
    :<|> "api" :> "v1" :> "asin" :> Capture "asin" Text :> Verb 'GET 200 '[JSON] Item -- 'getItemByASIN' route
    :<|> "api" :> "v1" :> "ean" :> Capture "ean" Text :> Verb 'GET 200 '[JSON] Item -- 'getItemByEAN' route
    :<|> "api" :> "v1" :> "upc" :> Capture "upc" Text :> Verb 'GET 200 '[JSON] Item -- 'getItemByUPC' route
    :<|> Raw 


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype Barcodable.comClientError = Barcodable.comClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for Barcodable.com.
-- The backend can be used both for the client and the server. The client generated from the Barcodable.com OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createBarcodable.comClient@). Alternatively, provided
-- a backend, the API can be served using @runBarcodable.comMiddlewareServer@.
data Barcodable.comBackend m = Barcodable.comBackend
  { convertCode :: Text -> m InlineResponse200{- ^ Returns the converted UPC, EAN, and ASIN codes. -}
  , getItemByASIN :: Text -> m Item{- ^ Returns a single item -}
  , getItemByEAN :: Text -> m Item{- ^ Returns a single item -}
  , getItemByUPC :: Text -> m Item{- ^ Returns a single item -}
  }

newtype Barcodable.comClient a = Barcodable.comClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative Barcodable.comClient where
  pure x = Barcodable.comClient (\_ -> pure x)
  (Barcodable.comClient f) <*> (Barcodable.comClient x) =
    Barcodable.comClient (\env -> f env <*> x env)

instance Monad Barcodable.comClient where
  (Barcodable.comClient a) >>= f =
    Barcodable.comClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO Barcodable.comClient where
  liftIO io = Barcodable.comClient (\_ -> liftIO io)

createBarcodable.comClient :: Barcodable.comBackend Barcodable.comClient
createBarcodable.comClient = Barcodable.comBackend{..}
  where
    ((coerce -> convertCode) :<|>
     (coerce -> getItemByASIN) :<|>
     (coerce -> getItemByEAN) :<|>
     (coerce -> getItemByUPC) :<|>
     _) = client (Proxy :: Proxy Barcodable.comAPI)

-- | Run requests in the Barcodable.comClient monad.
runBarcodable.comClient :: Config -> Barcodable.comClient a -> ExceptT ClientError IO a
runBarcodable.comClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runBarcodable.comClientWithManager manager clientConfig cl

-- | Run requests in the Barcodable.comClient monad using a custom manager.
runBarcodable.comClientWithManager :: Manager -> Config -> Barcodable.comClient a -> ExceptT ClientError IO a
runBarcodable.comClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a Barcodable.comClientError
callBarcodable.com
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> Barcodable.comClient a -> m a
callBarcodable.com env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (Barcodable.comClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the Barcodable.com server at the provided host and port.
runBarcodable.comServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Barcodable.comBackend (ExceptT ServerError IO) -> m ()
runBarcodable.comServer config backend = runBarcodable.comMiddlewareServer config requestMiddlewareId backend

-- | Run the Barcodable.com server at the provided host and port.
runBarcodable.comMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> Barcodable.comBackend (ExceptT ServerError IO) -> m ()
runBarcodable.comMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serve (Proxy :: Proxy Barcodable.comAPI) (serverFromBackend backend)
  where
    serverFromBackend Barcodable.comBackend{..} =
      (coerce convertCode :<|>
       coerce getItemByASIN :<|>
       coerce getItemByEAN :<|>
       coerce getItemByUPC :<|>
       serveDirectoryFileServer "static")
