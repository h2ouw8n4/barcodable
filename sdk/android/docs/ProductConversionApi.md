# ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="convertCode"></a>
# **convertCode**
> InlineResponse200 convertCode(upcEanAsin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```java
// Import classes:
//import org.openapitools.client.api.ProductConversionApi;

ProductConversionApi apiInstance = new ProductConversionApi();
String upcEanAsin = null; // String | UPC, EAN, or ASIN
try {
    InlineResponse200 result = apiInstance.convertCode(upcEanAsin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductConversionApi#convertCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcEanAsin** | **String**| UPC, EAN, or ASIN | [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

