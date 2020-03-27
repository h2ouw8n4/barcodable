# ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="convertCode"></a>
# **convertCode**
> inline_response_200 convertCode(upc Pipe ean Pipe asin)

Convert between UPC, EAN, and ASIN product codes.

    Returns the converted UPC, EAN, and ASIN codes.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc Pipe ean Pipe asin** | **String**| UPC, EAN, or ASIN | [default to null]

### Return type

[**inline_response_200**](..//Models/inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

