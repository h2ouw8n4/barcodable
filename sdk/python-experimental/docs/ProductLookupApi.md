# openapi_client.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_item_by_asin**](ProductLookupApi.md#get_item_by_asin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**get_item_by_ean**](ProductLookupApi.md#get_item_by_ean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**get_item_by_upc**](ProductLookupApi.md#get_item_by_upc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **get_item_by_asin**
> item.Item get_item_by_asin(asin)

Find item by asin code

Returns a single item

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProductLookupApi(api_client)
    asin = 'asin_example' # str | ASIN code of item to return
    
    # example passing only required values which don't have defaults set
    try:
        # Find item by asin code
        api_response = api_instance.get_item_by_asin(asin)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ProductLookupApi->get_item_by_asin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **str**| ASIN code of item to return |

### Return type

[**item.Item**](Item.md)

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
**404** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_ean**
> item.Item get_item_by_ean(ean)

Find item by UPC code

Returns a single item

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProductLookupApi(api_client)
    ean = 'ean_example' # str | EAN code of item to return
    
    # example passing only required values which don't have defaults set
    try:
        # Find item by UPC code
        api_response = api_instance.get_item_by_ean(ean)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ProductLookupApi->get_item_by_ean: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **str**| EAN code of item to return |

### Return type

[**item.Item**](Item.md)

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
**404** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_upc**
> item.Item get_item_by_upc(upc)

Find item by UPC code

Returns a single item

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ProductLookupApi(api_client)
    upc = 'upc_example' # str | UPC code of item to return
    
    # example passing only required values which don't have defaults set
    try:
        # Find item by UPC code
        api_response = api_instance.get_item_by_upc(upc)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ProductLookupApi->get_item_by_upc: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **str**| UPC code of item to return |

### Return type

[**item.Item**](Item.md)

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
**404** | search results matching criteria |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

