# ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApi.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupApi.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupApi.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="getItemByASIN"></a>
# **getItemByASIN**
> Item getItemByASIN(asin)

Find item by asin code

Returns a single item

### Example
```java
// Import classes:
//import org.openapitools.client.api.ProductLookupApi;

ProductLookupApi apiInstance = new ProductLookupApi();
String asin = null; // String | ASIN code of item to return
try {
    Item result = apiInstance.getItemByASIN(asin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductLookupApi#getItemByASIN");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| ASIN code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemByEAN"></a>
# **getItemByEAN**
> Item getItemByEAN(ean)

Find item by UPC code

Returns a single item

### Example
```java
// Import classes:
//import org.openapitools.client.api.ProductLookupApi;

ProductLookupApi apiInstance = new ProductLookupApi();
String ean = null; // String | EAN code of item to return
try {
    Item result = apiInstance.getItemByEAN(ean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductLookupApi#getItemByEAN");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **String**| EAN code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemByUPC"></a>
# **getItemByUPC**
> Item getItemByUPC(upc)

Find item by UPC code

Returns a single item

### Example
```java
// Import classes:
//import org.openapitools.client.api.ProductLookupApi;

ProductLookupApi apiInstance = new ProductLookupApi();
String upc = null; // String | UPC code of item to return
try {
    Item result = apiInstance.getItemByUPC(upc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductLookupApi#getItemByUPC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **String**| UPC code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

