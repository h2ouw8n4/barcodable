# openapi.api.ProductLookupApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApi.md#getItemByASIN) | **Get** /api/v1/asin/:asin | Find item by asin code
[**getItemByEAN**](ProductLookupApi.md#getItemByEAN) | **Get** /api/v1/ean/:ean | Find item by UPC code
[**getItemByUPC**](ProductLookupApi.md#getItemByUPC) | **Get** /api/v1/upc/:upc | Find item by UPC code


# **getItemByASIN**
> Item getItemByASIN(asin)

Find item by asin code

Returns a single item

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new ProductLookupApi();
var asin = asin_example; // String | ASIN code of item to return

try { 
    var result = api_instance.getItemByASIN(asin);
    print(result);
} catch (e) {
    print("Exception when calling ProductLookupApi->getItemByASIN: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| ASIN code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByEAN**
> Item getItemByEAN(ean)

Find item by UPC code

Returns a single item

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new ProductLookupApi();
var ean = ean_example; // String | EAN code of item to return

try { 
    var result = api_instance.getItemByEAN(ean);
    print(result);
} catch (e) {
    print("Exception when calling ProductLookupApi->getItemByEAN: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **String**| EAN code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByUPC**
> Item getItemByUPC(upc)

Find item by UPC code

Returns a single item

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new ProductLookupApi();
var upc = upc_example; // String | UPC code of item to return

try { 
    var result = api_instance.getItemByUPC(upc);
    print(result);
} catch (e) {
    print("Exception when calling ProductLookupApi->getItemByUPC: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **String**| UPC code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

