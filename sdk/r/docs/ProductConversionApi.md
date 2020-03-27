# ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConvertCode**](ProductConversionApi.md#ConvertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **ConvertCode**
> InlineResponse200 ConvertCode(upc...ean...asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```R
library(openapi)

var.upc...ean...asin <- 'upc...ean...asin_example' # character | UPC, EAN, or ASIN

#Convert between UPC, EAN, and ASIN product codes.
api.instance <- ProductConversionApi$new()
result <- api.instance$ConvertCode(var.upc...ean...asin)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc...ean...asin** | **character**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](inline_response_200.md)

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

