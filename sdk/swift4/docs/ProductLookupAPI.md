# ProductLookupAPI

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupAPI.md#getitembyasin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupAPI.md#getitembyean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupAPI.md#getitembyupc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **getItemByASIN**
```swift
    open class func getItemByASIN(asin: String, completion: @escaping (_ data: Item?, _ error: Error?) -> Void)
```

Find item by asin code

Returns a single item

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let asin = "asin_example" // String | ASIN code of item to return

// Find item by asin code
ProductLookupAPI.getItemByASIN(asin: asin) { (response, error) in
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
 **asin** | **String** | ASIN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByEAN**
```swift
    open class func getItemByEAN(ean: String, completion: @escaping (_ data: Item?, _ error: Error?) -> Void)
```

Find item by UPC code

Returns a single item

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let ean = "ean_example" // String | EAN code of item to return

// Find item by UPC code
ProductLookupAPI.getItemByEAN(ean: ean) { (response, error) in
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
 **ean** | **String** | EAN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByUPC**
```swift
    open class func getItemByUPC(upc: String, completion: @escaping (_ data: Item?, _ error: Error?) -> Void)
```

Find item by UPC code

Returns a single item

### Example 
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let upc = "upc_example" // String | UPC code of item to return

// Find item by UPC code
ProductLookupAPI.getItemByUPC(upc: upc) { (response, error) in
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
 **upc** | **String** | UPC code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

