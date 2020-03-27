# Org.OpenAPITools.Api.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetItemByASIN**](ProductLookupApi.md#getitembyasin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**GetItemByEAN**](ProductLookupApi.md#getitembyean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**GetItemByUPC**](ProductLookupApi.md#getitembyupc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="getitembyasin"></a>
# **GetItemByASIN**
> Item GetItemByASIN (string asin)

Find item by asin code

Returns a single item

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetItemByASINExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";
            var apiInstance = new ProductLookupApi(config);
            var asin = asin_example;  // string | ASIN code of item to return

            try
            {
                // Find item by asin code
                Item result = apiInstance.GetItemByASIN(asin);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ProductLookupApi.GetItemByASIN: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **string**| ASIN code of item to return | 

### Return type

[**Item**](Item.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getitembyean"></a>
# **GetItemByEAN**
> Item GetItemByEAN (string ean)

Find item by UPC code

Returns a single item

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetItemByEANExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";
            var apiInstance = new ProductLookupApi(config);
            var ean = ean_example;  // string | EAN code of item to return

            try
            {
                // Find item by UPC code
                Item result = apiInstance.GetItemByEAN(ean);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ProductLookupApi.GetItemByEAN: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **string**| EAN code of item to return | 

### Return type

[**Item**](Item.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getitembyupc"></a>
# **GetItemByUPC**
> Item GetItemByUPC (string upc)

Find item by UPC code

Returns a single item

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetItemByUPCExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";
            var apiInstance = new ProductLookupApi(config);
            var upc = upc_example;  // string | UPC code of item to return

            try
            {
                // Find item by UPC code
                Item result = apiInstance.GetItemByUPC(upc);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ProductLookupApi.GetItemByUPC: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **string**| UPC code of item to return | 

### Return type

[**Item**](Item.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

