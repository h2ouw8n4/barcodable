# Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upc** | Option<**String**> |  | [optional]
**ean** | Option<**String**> |  | [optional]
**isbn** | Option<**String**> |  | [optional]
**asin** | Option<**String**> |  | [optional]
**title** | Option<**String**> |  | [optional]
**sku** | Option<**String**> |  | [optional]
**mpn** | Option<**String**> |  | [optional]
**part_number** | Option<**String**> |  | [optional]
**upcs** | Option<**Vec<String>**> | A list of matching upc codes. | [optional]
**description** | Option<**String**> |  | [optional]
**brand** | Option<**String**> |  | [optional]
**manufacturer** | Option<**String**> |  | [optional]
**color** | Option<**String**> |  | [optional]
**new_price** | Option<**f32**> |  | [optional]
**used_price** | Option<**f32**> |  | [optional]
**currency_code** | Option<**String**> |  | [optional]
**url** | Option<**String**> |  | [optional]
**features** | Option<**Vec<String>**> | A list of product feature descriptions. | [optional]
**dimensions** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> | Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') | [optional]
**images** | Option<**Vec<String>**> | A list product images. | [optional]
**matched_items** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> | Matched items for this product. | [optional]
**iso_country_codes** | Option<**Vec<String>**> | A list of country codes from which this item belongs. | [optional]
**company_name** | Option<**String**> | The company name registered to the product's UPC or EAN. | [optional]
**company_address** | Option<**String**> | The company address registered to the product's UPC or EAN. | [optional]
**categories** | Option<**Vec<String>**> | A list of categories for this product. | [optional]
**category_hierarchies** | Option<**Vec<String>**> | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


