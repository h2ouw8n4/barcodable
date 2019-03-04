# Org.OpenAPITools.Api.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

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
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetItemByASINExample
    {
        public void main()
        {
            
            var apiInstance = new ProductLookupApi();
            var asin = asin_example;  // string | ASIN code of item to return

            try
            {
                // Find item by asin code
                Item result = apiInstance.GetItemByASIN(asin);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProductLookupApi.GetItemByASIN: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getitembyean"></a>
# **GetItemByEAN**
> Item GetItemByEAN (string ean)

Find item by UPC code

Returns a single item

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetItemByEANExample
    {
        public void main()
        {
            
            var apiInstance = new ProductLookupApi();
            var ean = ean_example;  // string | EAN code of item to return

            try
            {
                // Find item by UPC code
                Item result = apiInstance.GetItemByEAN(ean);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProductLookupApi.GetItemByEAN: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getitembyupc"></a>
# **GetItemByUPC**
> Item GetItemByUPC (string upc)

Find item by UPC code

Returns a single item

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetItemByUPCExample
    {
        public void main()
        {
            
            var apiInstance = new ProductLookupApi();
            var upc = upc_example;  // string | UPC code of item to return

            try
            {
                // Find item by UPC code
                Item result = apiInstance.GetItemByUPC(upc);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProductLookupApi.GetItemByUPC: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

