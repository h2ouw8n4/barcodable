# ProductConversionAPI

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionAPI.md#convertcode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convertCode**
```swift
    open class func convertCode(upcEanAsin: String, completion: @escaping (_ data: InlineResponse200?, _ error: Error?) -> Void)
```

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let upcEanAsin = "upcEanAsin_example" // String | UPC, EAN, or ASIN

// Convert between UPC, EAN, and ASIN product codes.
ProductConversionAPI.convertCode(upcEanAsin: upcEanAsin) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcEanAsin** | **String** | UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

