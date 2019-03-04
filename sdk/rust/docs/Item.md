# Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upc** | **String** |  | [optional] 
**ean** | **String** |  | [optional] 
**isbn** | **String** |  | [optional] 
**asin** | **String** |  | [optional] 
**title** | **String** |  | [optional] 
**sku** | **String** |  | [optional] 
**mpn** | **String** |  | [optional] 
**part_number** | **String** |  | [optional] 
**upcs** | **Vec<String>** | A list of matching upc codes. | [optional] 
**description** | **String** |  | [optional] 
**brand** | **String** |  | [optional] 
**manufacturer** | **String** |  | [optional] 
**color** | **String** |  | [optional] 
**new_price** | **f32** |  | [optional] 
**used_price** | **f32** |  | [optional] 
**currency_code** | **String** |  | [optional] 
**url** | **String** |  | [optional] 
**features** | **Vec<String>** | A list of product feature descriptions. | [optional] 
**dimensions** | [**Vec<Value>**](Value.md) | Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') | [optional] 
**images** | **Vec<String>** | A list product images. | [optional] 
**matched_items** | [**Vec<Value>**](Value.md) | Matched items for this product. | [optional] 
**iso_country_codes** | **Vec<String>** | A list of country codes from which this item belongs. | [optional] 
**company_name** | **String** | The company name registered to the product's UPC or EAN. | [optional] 
**company_address** | **String** | The company address registered to the product's UPC or EAN. | [optional] 
**categories** | **Vec<String>** | A list of categories for this product. | [optional] 
**category_hierarchies** | **Vec<String>** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


