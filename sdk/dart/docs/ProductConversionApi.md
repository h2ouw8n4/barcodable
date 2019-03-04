# openapi.api.ProductConversionApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convertCode**
> InlineResponse200 convertCode(upc | ean | asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new ProductConversionApi();
var upc | ean | asin = upc | ean | asin_example; // String | UPC, EAN, or ASIN

try { 
    var result = api_instance.convertCode(upc | ean | asin);
    print(result);
} catch (e) {
    print("Exception when calling ProductConversionApi->convertCode: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc | ean | asin** | **String**| UPC, EAN, or ASIN | [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

