# openapi_client.ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convert_code**](ProductConversionApi.md#convert_code) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convert_code**
> inline_response200.InlineResponse200 convert_code(upc___ean___asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProductConversionApi(api_client)
    upc___ean___asin = 'upc___ean___asin_example' # str | UPC, EAN, or ASIN
    
    # example passing only required values which don't have defaults set
    try:
        # Convert between UPC, EAN, and ASIN product codes.
        api_response = api_instance.convert_code(upc___ean___asin)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ProductConversionApi->convert_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc___ean___asin** | **str**| UPC, EAN, or ASIN |

### Return type

[**inline_response200.InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  * X-ValidAuthorization - A boolean indicating whether the API key in use is valid. Requests with an invalid subscription, incorrect key, or no key will return &#39;false&#39;. <br>  * X-RateLimit-Limit - An integer specifying the number of requests available per day. This number is definied by your subscription plan. <br>  * X-RateLimit-Remaining - An integer specifying the number of remaining requests per day. <br>  * X-RateLimit-Reset - A timestamp specifying the time in which the daily rate limit is reset. <br>  |
**400** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

