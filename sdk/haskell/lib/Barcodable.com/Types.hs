{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Barcodable.com.Types (
  InlineResponse200 (..),
  InlineResponse400 (..),
  InvalidCode (..),
  Item (..),
  NotFound (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (stripPrefix)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)
import Data.Function ((&))


-- | 
data InlineResponse200 = InlineResponse200
  { inlineResponse200Upcs :: Maybe [Text] -- ^ A list of UPCs
  , inlineResponse200Eans :: Maybe [Text] -- ^ A list of EANs
  , inlineResponse200Asins :: Maybe [Text] -- ^ A list of ASINs
  , inlineResponse200Message :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse200 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse200")
instance ToJSON InlineResponse200 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse200")


-- | 
data InlineResponse400 = InlineResponse400
  { inlineResponse400Message :: Maybe Text -- ^ 
  , inlineResponse400Status :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InlineResponse400 where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "inlineResponse400")
instance ToJSON InlineResponse400 where
  toJSON = genericToJSON (removeFieldLabelPrefix False "inlineResponse400")


-- | 
data InvalidCode = InvalidCode
  { invalidCodeMessage :: Maybe Text -- ^ 
  , invalidCodeStatus :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InvalidCode where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "invalidCode")
instance ToJSON InvalidCode where
  toJSON = genericToJSON (removeFieldLabelPrefix False "invalidCode")


-- | 
data Item = Item
  { itemUpc :: Maybe Text -- ^ 
  , itemEan :: Maybe Text -- ^ 
  , itemIsbn :: Maybe Text -- ^ 
  , itemAsin :: Maybe Text -- ^ 
  , itemTitle :: Maybe Text -- ^ 
  , itemSku :: Maybe Text -- ^ 
  , itemMpn :: Maybe Text -- ^ 
  , itemPartUnderscorenumber :: Maybe Text -- ^ 
  , itemUpcs :: Maybe [Text] -- ^ A list of matching upc codes.
  , itemDescription :: Maybe Text -- ^ 
  , itemBrand :: Maybe Text -- ^ 
  , itemManufacturer :: Maybe Text -- ^ 
  , itemColor :: Maybe Text -- ^ 
  , itemNewUnderscoreprice :: Maybe Double -- ^ 
  , itemUsedUnderscoreprice :: Maybe Double -- ^ 
  , itemCurrencyUnderscorecode :: Maybe Text -- ^ 
  , itemUrl :: Maybe Text -- ^ 
  , itemFeatures :: Maybe [Text] -- ^ A list of product feature descriptions.
  , itemDimensions :: Maybe [Value] -- ^ Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
  , itemImages :: Maybe [Text] -- ^ A list product images.
  , itemMatchedUnderscoreitems :: Maybe [Value] -- ^ Matched items for this product.
  , itemIsoUnderscorecountryUnderscorecodes :: Maybe [Text] -- ^ A list of country codes from which this item belongs.
  , itemCompanyUnderscorename :: Maybe Text -- ^ The company name registered to the product's UPC or EAN.
  , itemCompanyUnderscoreaddress :: Maybe Text -- ^ The company address registered to the product's UPC or EAN.
  , itemCategories :: Maybe [Text] -- ^ A list of categories for this product.
  , itemCategoryUnderscorehierarchies :: Maybe [Text] -- ^ A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Item where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "item")
instance ToJSON Item where
  toJSON = genericToJSON (removeFieldLabelPrefix False "item")


-- | 
data NotFound = NotFound
  { notFoundMessage :: Maybe Text -- ^ 
  , notFoundStatus :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotFound where
  parseJSON = genericParseJSON (removeFieldLabelPrefix True "notFound")
instance ToJSON NotFound where
  toJSON = genericToJSON (removeFieldLabelPrefix False "notFound")


uncapitalize :: String -> String
uncapitalize (first:rest) = Char.toLower first : rest
uncapitalize [] = []

-- Remove a field label prefix during JSON parsing.
-- Also perform any replacements for special characters.
removeFieldLabelPrefix :: Bool -> String -> Options
removeFieldLabelPrefix forParsing prefix =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = uncapitalize . fromMaybe (error ("did not find prefix " ++ prefix)) . stripPrefix prefix . replaceSpecialChars
    }
  where
    replaceSpecialChars field = foldl (&) field (map mkCharReplacement specialChars)
    specialChars =
      [ ("@", "'At")
      , ("\\", "'Back_Slash")
      , ("<=", "'Less_Than_Or_Equal_To")
      , ("\"", "'Double_Quote")
      , ("[", "'Left_Square_Bracket")
      , ("]", "'Right_Square_Bracket")
      , ("^", "'Caret")
      , ("_", "'Underscore")
      , ("`", "'Backtick")
      , ("!", "'Exclamation")
      , ("#", "'Hash")
      , ("$", "'Dollar")
      , ("%", "'Percent")
      , ("&", "'Ampersand")
      , ("'", "'Quote")
      , ("(", "'Left_Parenthesis")
      , (")", "'Right_Parenthesis")
      , ("*", "'Star")
      , ("+", "'Plus")
      , (",", "'Comma")
      , ("-", "'Dash")
      , (".", "'Period")
      , ("/", "'Slash")
      , (":", "'Colon")
      , ("{", "'Left_Curly_Bracket")
      , ("|", "'Pipe")
      , ("<", "'LessThan")
      , ("!=", "'Not_Equal")
      , ("=", "'Equal")
      , ("}", "'Right_Curly_Bracket")
      , (">", "'GreaterThan")
      , ("~", "'Tilde")
      , ("?", "'Question_Mark")
      , (">=", "'Greater_Than_Or_Equal_To")
      ]
    mkCharReplacement (replaceStr, searchStr) = T.unpack . replacer (T.pack searchStr) (T.pack replaceStr) . T.pack
    replacer =
      if forParsing
        then flip T.replace
        else T.replace
