# ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetItemByASIN**](ProductLookupApi.md#GetItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**GetItemByEAN**](ProductLookupApi.md#GetItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**GetItemByUPC**](ProductLookupApi.md#GetItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **GetItemByASIN**
> Item GetItemByASIN(asin)

Find item by asin code

Returns a single item

### Example
```R
library(openapi)

var.asin <- 'asin_example' # character | ASIN code of item to return

#Find item by asin code
api.instance <- ProductLookupApi$new()
result <- api.instance$GetItemByASIN(var.asin)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **character**| ASIN code of item to return | 

### Return type

[**Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-ValidAuthorization - A boolean indicating whether the API key in use is valid. Requests with an invalid subscription, incorrect key, or no key will return &#39;false&#39;. <br>  * X-RateLimit-Limit - An integer specifying the number of requests available per day. This number is definied by your subscription plan. <br>  * X-RateLimit-Remaining - An integer specifying the number of remaining requests per day. <br>  * X-RateLimit-Reset - A timestamp specifying the time in which the daily rate limit is reset. <br>  |
| **400** | search results matching criteria |  -  |
| **404** | search results matching criteria |  -  |

# **GetItemByEAN**
> Item GetItemByEAN(ean)

Find item by UPC code

Returns a single item

### Example
```R
library(openapi)

var.ean <- 'ean_example' # character | EAN code of item to return

#Find item by UPC code
api.instance <- ProductLookupApi$new()
result <- api.instance$GetItemByEAN(var.ean)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **character**| EAN code of item to return | 

### Return type

[**Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-ValidAuthorization - A boolean indicating whether the API key in use is valid. Requests with an invalid subscription, incorrect key, or no key will return &#39;false&#39;. <br>  * X-RateLimit-Limit - An integer specifying the number of requests available per day. This number is definied by your subscription plan. <br>  * X-RateLimit-Remaining - An integer specifying the number of remaining requests per day. <br>  * X-RateLimit-Reset - A timestamp specifying the time in which the daily rate limit is reset. <br>  |
| **400** | search results matching criteria |  -  |
| **404** | search results matching criteria |  -  |

# **GetItemByUPC**
> Item GetItemByUPC(upc)

Find item by UPC code

Returns a single item

### Example
```R
library(openapi)

var.upc <- 'upc_example' # character | UPC code of item to return

#Find item by UPC code
api.instance <- ProductLookupApi$new()
result <- api.instance$GetItemByUPC(var.upc)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **character**| UPC code of item to return | 

### Return type

[**Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-ValidAuthorization - A boolean indicating whether the API key in use is valid. Requests with an invalid subscription, incorrect key, or no key will return &#39;false&#39;. <br>  * X-RateLimit-Limit - An integer specifying the number of requests available per day. This number is definied by your subscription plan. <br>  * X-RateLimit-Remaining - An integer specifying the number of remaining requests per day. <br>  * X-RateLimit-Reset - A timestamp specifying the time in which the daily rate limit is reset. <br>  |
| **400** | search results matching criteria |  -  |
| **404** | search results matching criteria |  -  |

