# product_conversion_api

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
**convertCode**](product_conversion_api.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convertCode**
> models::InlineResponse200 convertCode(upc___ean___asin)
Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **upc___ean___asin** | **String**| UPC, EAN, or ASIN | 

### Return type

[**models::InlineResponse200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

