# WWW::OpenAPIClient::Object::Item

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Item;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upc** | **string** |  | [optional] 
**ean** | **string** |  | [optional] 
**isbn** | **string** |  | [optional] 
**asin** | **string** |  | [optional] 
**title** | **string** |  | [optional] 
**sku** | **string** |  | [optional] 
**mpn** | **string** |  | [optional] 
**part_number** | **string** |  | [optional] 
**upcs** | **ARRAY[string]** | A list of matching upc codes. | [optional] 
**description** | **string** |  | [optional] 
**brand** | **string** |  | [optional] 
**manufacturer** | **string** |  | [optional] 
**color** | **string** |  | [optional] 
**new_price** | **double** |  | [optional] 
**used_price** | **double** |  | [optional] 
**currency_code** | **string** |  | [optional] 
**url** | **string** |  | [optional] 
**features** | **ARRAY[string]** | A list of product feature descriptions. | [optional] 
**dimensions** | **ARRAY[object]** | Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) | [optional] 
**images** | **ARRAY[string]** | A list product images. | [optional] 
**matched_items** | **ARRAY[object]** | Matched items for this product. | [optional] 
**iso_country_codes** | **ARRAY[string]** | A list of country codes from which this item belongs. | [optional] 
**company_name** | **string** | The company name registered to the product&#39;s UPC or EAN. | [optional] 
**company_address** | **string** | The company address registered to the product&#39;s UPC or EAN. | [optional] 
**categories** | **ARRAY[string]** | A list of categories for this product. | [optional] 
**category_hierarchies** | **ARRAY[string]** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


