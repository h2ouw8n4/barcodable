# openapi::Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upc** | **character** |  | [optional] 
**ean** | **character** |  | [optional] 
**isbn** | **character** |  | [optional] 
**asin** | **character** |  | [optional] 
**title** | **character** |  | [optional] 
**sku** | **character** |  | [optional] 
**mpn** | **character** |  | [optional] 
**part_number** | **character** |  | [optional] 
**upcs** | **array[character]** | A list of matching upc codes. | [optional] 
**description** | **character** |  | [optional] 
**brand** | **character** |  | [optional] 
**manufacturer** | **character** |  | [optional] 
**color** | **character** |  | [optional] 
**new_price** | **numeric** |  | [optional] 
**used_price** | **numeric** |  | [optional] 
**currency_code** | **character** |  | [optional] 
**url** | **character** |  | [optional] 
**features** | **array[character]** | A list of product feature descriptions. | [optional] 
**dimensions** | **array[object]** | Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) | [optional] 
**images** | **array[character]** | A list product images. | [optional] 
**matched_items** | **array[object]** | Matched items for this product. | [optional] 
**iso_country_codes** | **array[character]** | A list of country codes from which this item belongs. | [optional] 
**company_name** | **character** | The company name registered to the product&#39;s UPC or EAN. | [optional] 
**company_address** | **character** | The company address registered to the product&#39;s UPC or EAN. | [optional] 
**categories** | **array[character]** | A list of categories for this product. | [optional] 
**category_hierarchies** | **array[character]** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] 


