{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import Barcodable.com.Model
import Barcodable.com.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 5) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy InlineResponse200)
      propMimeEq MimeJSON (Proxy :: Proxy InlineResponse400)
      propMimeEq MimeJSON (Proxy :: Proxy InvalidCode)
      propMimeEq MimeJSON (Proxy :: Proxy Item)
      propMimeEq MimeJSON (Proxy :: Proxy NotFound)
      
