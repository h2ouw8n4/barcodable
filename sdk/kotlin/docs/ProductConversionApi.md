# ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="convertCode"></a>
# **convertCode**
> InlineResponse200 convertCode(upcPipeEanPipeAsin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductConversionApi()
val upcPipeEanPipeAsin : kotlin.String = upcPipeEanPipeAsin_example // kotlin.String | UPC, EAN, or ASIN
try {
    val result : InlineResponse200 = apiInstance.convertCode(upcPipeEanPipeAsin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductConversionApi#convertCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductConversionApi#convertCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcPipeEanPipeAsin** | **kotlin.String**| UPC, EAN, or ASIN |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

