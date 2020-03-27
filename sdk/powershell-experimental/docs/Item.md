# Item
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Upc** | **String** |  | [optional] [default to null]
**Ean** | **String** |  | [optional] [default to null]
**Isbn** | **String** |  | [optional] [default to null]
**Asin** | **String** |  | [optional] [default to null]
**Title** | **String** |  | [optional] [default to null]
**Sku** | **String** |  | [optional] [default to null]
**Mpn** | **String** |  | [optional] [default to null]
**PartNumber** | **String** |  | [optional] [default to null]
**Upcs** | **String[]** | A list of matching upc codes. | [optional] [default to null]
**Description** | **String** |  | [optional] [default to null]
**Brand** | **String** |  | [optional] [default to null]
**Manufacturer** | **String** |  | [optional] [default to null]
**Color** | **String** |  | [optional] [default to null]
**NewPrice** | **Decimal** |  | [optional] [default to null]
**UsedPrice** | **Decimal** |  | [optional] [default to null]
**CurrencyCode** | **String** |  | [optional] [default to null]
**Url** | **String** |  | [optional] [default to null]
**Features** | **String[]** | A list of product feature descriptions. | [optional] [default to null]
**Dimensions** | **String[]** | Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) | [optional] [default to null]
**Images** | **String[]** | A list product images. | [optional] [default to null]
**MatchedItems** | **String[]** | Matched items for this product. | [optional] [default to null]
**IsoCountryCodes** | **String[]** | A list of country codes from which this item belongs. | [optional] [default to null]
**CompanyName** | **String** | The company name registered to the product&#39;s UPC or EAN. | [optional] [default to null]
**CompanyAddress** | **String** | The company address registered to the product&#39;s UPC or EAN. | [optional] [default to null]
**Categories** | **String[]** | A list of categories for this product. | [optional] [default to null]
**CategoryHierarchies** | **String[]** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] [default to null]

## Examples

- Create a new object
```powershell
New-PSOpenAPIToolsItem  -Upc 190198155795 `
 -Ean 190198155795 `
 -Isbn 9780198155795 `
 -Asin B01M1EXQY4 `
 -Title Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black) `
 -Sku 903061477 `
 -Mpn A1660 `
 -PartNumber 14 `
 -Upcs [&quot;190198071835, 647627503790, 759776410383, 190198068507&quot;] `
 -Description The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance! `
 -Brand Apple `
 -Manufacturer Apple `
 -Color Black `
 -NewPrice 799.95 `
 -UsedPrice 659.95 `
 -CurrencyCode USD `
 -Url https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4 `
 -Features [&quot;Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.&quot;,&quot;The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor.&quot;] `
 -Dimensions null `
 -Images [&quot;https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg&quot;,&quot;https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg&quot;] `
 -MatchedItems null `
 -IsoCountryCodes [&quot;US&quot;,&quot;GB&quot;] `
 -CompanyName Apple Inc. `
 -CompanyAddress 101 Infinite Loop, Cupertino, CA 95014 `
 -Categories [&quot;Unlocked Cell Phones&quot;,&quot;Electronics&quot;] `
 -CategoryHierarchies [[&quot;Cell Phones &amp; Accessories&quot;,&quot;Cell Phones&quot;,&quot;Unlocked Cell Phones&quot;]]
```

- Convert the object to JSON
```powershell
$ | Convert-ToJSON
```


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

