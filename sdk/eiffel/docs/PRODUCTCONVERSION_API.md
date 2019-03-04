# PRODUCTCONVERSION_API

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**convert_code**](PRODUCTCONVERSION_API.md#convert_code) | **Get** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convert_code**
> convert_code (upc___ean___asin: STRING_32 ): detachable INLINE_RESPONSE_200
	

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc___ean___asin** | **STRING_32**| UPC, EAN, or ASIN | [default to null]

### Return type

[**INLINE_RESPONSE_200**](inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

