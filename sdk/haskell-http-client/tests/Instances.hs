{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

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
    
arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models
 
instance Arbitrary InlineResponse200 where
  arbitrary = sized genInlineResponse200

genInlineResponse200 :: Int -> Gen InlineResponse200
genInlineResponse200 n =
  InlineResponse200
    <$> arbitraryReducedMaybe n -- inlineResponse200Upcs :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- inlineResponse200Eans :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- inlineResponse200Asins :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- inlineResponse200Message :: Maybe Text
  
instance Arbitrary InlineResponse400 where
  arbitrary = sized genInlineResponse400

genInlineResponse400 :: Int -> Gen InlineResponse400
genInlineResponse400 n =
  InlineResponse400
    <$> arbitraryReducedMaybe n -- inlineResponse400Message :: Maybe Text
    <*> arbitraryReducedMaybe n -- inlineResponse400Status :: Maybe Int
  
instance Arbitrary InvalidCode where
  arbitrary = sized genInvalidCode

genInvalidCode :: Int -> Gen InvalidCode
genInvalidCode n =
  InvalidCode
    <$> arbitraryReducedMaybe n -- invalidCodeMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- invalidCodeStatus :: Maybe Int
  
instance Arbitrary Item where
  arbitrary = sized genItem

genItem :: Int -> Gen Item
genItem n =
  Item
    <$> arbitraryReducedMaybe n -- itemUpc :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemEan :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemIsbn :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemAsin :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemTitle :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemSku :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemMpn :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemPartNumber :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemUpcs :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemDescription :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemBrand :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemManufacturer :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemColor :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemNewPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- itemUsedPrice :: Maybe Double
    <*> arbitraryReducedMaybe n -- itemCurrencyCode :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemFeatures :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemDimensions :: Maybe [A.Value]
    <*> arbitraryReducedMaybe n -- itemImages :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemMatchedItems :: Maybe [A.Value]
    <*> arbitraryReducedMaybe n -- itemIsoCountryCodes :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemCompanyName :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemCompanyAddress :: Maybe Text
    <*> arbitraryReducedMaybe n -- itemCategories :: Maybe [Text]
    <*> arbitraryReducedMaybe n -- itemCategoryHierarchies :: Maybe [Text]
  
instance Arbitrary NotFound where
  arbitrary = sized genNotFound

genNotFound :: Int -> Gen NotFound
genNotFound n =
  NotFound
    <$> arbitraryReducedMaybe n -- notFoundMessage :: Maybe Text
    <*> arbitraryReducedMaybe n -- notFoundStatus :: Maybe Int
  



