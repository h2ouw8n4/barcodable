# Org.OpenAPITools.Api.ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConvertCode**](ProductConversionApi.md#convertcode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="convertcode"></a>
# **ConvertCode**
> InlineResponse200 ConvertCode (string upcEanAsin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ConvertCodeExample
    {
        public void main()
        {
            var apiInstance = new ProductConversionApi();
            var upcEanAsin = upcEanAsin_example;  // string | UPC, EAN, or ASIN

            try
            {
                // Convert between UPC, EAN, and ASIN product codes.
                InlineResponse200 result = apiInstance.ConvertCode(upcEanAsin);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProductConversionApi.ConvertCode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcEanAsin** | **string**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

