# openapi.model.Item

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upc** | **String** |  | [optional] [default to null]
**ean** | **String** |  | [optional] [default to null]
**isbn** | **String** |  | [optional] [default to null]
**asin** | **String** |  | [optional] [default to null]
**title** | **String** |  | [optional] [default to null]
**sku** | **String** |  | [optional] [default to null]
**mpn** | **String** |  | [optional] [default to null]
**partNumber** | **String** |  | [optional] [default to null]
**upcs** | **List&lt;String&gt;** | A list of matching upc codes. | [optional] [default to []]
**description** | **String** |  | [optional] [default to null]
**brand** | **String** |  | [optional] [default to null]
**manufacturer** | **String** |  | [optional] [default to null]
**color** | **String** |  | [optional] [default to null]
**newPrice** | **num** |  | [optional] [default to null]
**usedPrice** | **num** |  | [optional] [default to null]
**currencyCode** | **String** |  | [optional] [default to null]
**url** | **String** |  | [optional] [default to null]
**features** | **List&lt;String&gt;** | A list of product feature descriptions. | [optional] [default to []]
**dimensions** | [**List&lt;Object&gt;**](Object.md) | Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) | [optional] [default to []]
**images** | **List&lt;String&gt;** | A list product images. | [optional] [default to []]
**matchedItems** | [**List&lt;Object&gt;**](Object.md) | Matched items for this product. | [optional] [default to []]
**isoCountryCodes** | **List&lt;String&gt;** | A list of country codes from which this item belongs. | [optional] [default to []]
**companyName** | **String** | The company name registered to the product&#39;s UPC or EAN. | [optional] [default to null]
**companyAddress** | **String** | The company address registered to the product&#39;s UPC or EAN. | [optional] [default to null]
**categories** | **List&lt;String&gt;** | A list of categories for this product. | [optional] [default to []]
**categoryHierarchies** | **List&lt;String&gt;** | A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. | [optional] [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


