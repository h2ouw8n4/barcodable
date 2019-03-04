# openapi_client.ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convert_code**](ProductConversionApi.md#convert_code) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convert_code**
> InlineResponse200 convert_code(upc___ean___asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.ProductConversionApi()
upc___ean___asin = 'upc___ean___asin_example' # str | UPC, EAN, or ASIN

try:
    # Convert between UPC, EAN, and ASIN product codes.
    api_response = api_instance.convert_code(upc___ean___asin)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductConversionApi->convert_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc___ean___asin** | **str**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

