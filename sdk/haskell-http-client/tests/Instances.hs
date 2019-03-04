{-# OPTIONS_GHC -fno-warn-unused-imports #-}

module Instances where

import Barcodable.com.Model
import Barcodable.com.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

-- * Models
 
instance Arbitrary InlineResponse200 where
  arbitrary =
    InlineResponse200
      <$> arbitrary -- inlineResponse200Upcs :: Maybe [Text]
      <*> arbitrary -- inlineResponse200Eans :: Maybe [Text]
      <*> arbitrary -- inlineResponse200Asins :: Maybe [Text]
      <*> arbitrary -- inlineResponse200Message :: Maybe Text
    
instance Arbitrary InlineResponse400 where
  arbitrary =
    InlineResponse400
      <$> arbitrary -- inlineResponse400Message :: Maybe Text
      <*> arbitrary -- inlineResponse400Status :: Maybe Int
    
instance Arbitrary InvalidCode where
  arbitrary =
    InvalidCode
      <$> arbitrary -- invalidCodeMessage :: Maybe Text
      <*> arbitrary -- invalidCodeStatus :: Maybe Int
    
instance Arbitrary Item where
  arbitrary =
    Item
      <$> arbitrary -- itemUpc :: Maybe Text
      <*> arbitrary -- itemEan :: Maybe Text
      <*> arbitrary -- itemIsbn :: Maybe Text
      <*> arbitrary -- itemAsin :: Maybe Text
      <*> arbitrary -- itemTitle :: Maybe Text
      <*> arbitrary -- itemSku :: Maybe Text
      <*> arbitrary -- itemMpn :: Maybe Text
      <*> arbitrary -- itemPartNumber :: Maybe Text
      <*> arbitrary -- itemUpcs :: Maybe [Text]
      <*> arbitrary -- itemDescription :: Maybe Text
      <*> arbitrary -- itemBrand :: Maybe Text
      <*> arbitrary -- itemManufacturer :: Maybe Text
      <*> arbitrary -- itemColor :: Maybe Text
      <*> arbitrary -- itemNewPrice :: Maybe Double
      <*> arbitrary -- itemUsedPrice :: Maybe Double
      <*> arbitrary -- itemCurrencyCode :: Maybe Text
      <*> arbitrary -- itemUrl :: Maybe Text
      <*> arbitrary -- itemFeatures :: Maybe [Text]
      <*> arbitrary -- itemDimensions :: Maybe [A.Value]
      <*> arbitrary -- itemImages :: Maybe [Text]
      <*> arbitrary -- itemMatchedItems :: Maybe [A.Value]
      <*> arbitrary -- itemIsoCountryCodes :: Maybe [Text]
      <*> arbitrary -- itemCompanyName :: Maybe Text
      <*> arbitrary -- itemCompanyAddress :: Maybe Text
      <*> arbitrary -- itemCategories :: Maybe [Text]
      <*> arbitrary -- itemCategoryHierarchies :: Maybe [Text]
    
instance Arbitrary NotFound where
  arbitrary =
    NotFound
      <$> arbitrary -- notFoundMessage :: Maybe Text
      <*> arbitrary -- notFoundStatus :: Maybe Int
    


