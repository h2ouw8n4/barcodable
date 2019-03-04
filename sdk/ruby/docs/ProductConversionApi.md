# OpenapiClient::ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convert_code**](ProductConversionApi.md#convert_code) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convert_code**
> InlineResponse200 convert_code(upc___ean___asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::ProductConversionApi.new
upc___ean___asin = 'upc___ean___asin_example' # String | UPC, EAN, or ASIN

begin
  #Convert between UPC, EAN, and ASIN product codes.
  result = api_instance.convert_code(upc___ean___asin)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ProductConversionApi->convert_code: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc___ean___asin** | **String**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



