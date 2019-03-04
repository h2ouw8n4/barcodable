# \ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConvertCode**](ProductConversionApi.md#ConvertCode) | **Get** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **ConvertCode**
> InlineResponse200 ConvertCode(ctx, upcEanAsin)
Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **upcEanAsin** | **string**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

