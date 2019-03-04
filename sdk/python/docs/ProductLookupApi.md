# openapi_client.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_item_by_asin**](ProductLookupApi.md#get_item_by_asin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**get_item_by_ean**](ProductLookupApi.md#get_item_by_ean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**get_item_by_upc**](ProductLookupApi.md#get_item_by_upc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **get_item_by_asin**
> Item get_item_by_asin(asin)

Find item by asin code

Returns a single item

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.ProductLookupApi()
asin = 'asin_example' # str | ASIN code of item to return

try:
    # Find item by asin code
    api_response = api_instance.get_item_by_asin(asin)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductLookupApi->get_item_by_asin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **str**| ASIN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_ean**
> Item get_item_by_ean(ean)

Find item by UPC code

Returns a single item

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.ProductLookupApi()
ean = 'ean_example' # str | EAN code of item to return

try:
    # Find item by UPC code
    api_response = api_instance.get_item_by_ean(ean)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductLookupApi->get_item_by_ean: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **str**| EAN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_upc**
> Item get_item_by_upc(upc)

Find item by UPC code

Returns a single item

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.ProductLookupApi()
upc = 'upc_example' # str | UPC code of item to return

try:
    # Find item by UPC code
    api_response = api_instance.get_item_by_upc(upc)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProductLookupApi->get_item_by_upc: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **str**| UPC code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

