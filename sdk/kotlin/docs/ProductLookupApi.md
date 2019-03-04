# ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductLookupApi()
val asin : kotlin.String = asin_example // kotlin.String | ASIN code of item to return
try {
    val result : Item = apiInstance.getItemByASIN(asin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductLookupApi#getItemByASIN")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductLookupApi#getItemByASIN")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **kotlin.String**| ASIN code of item to return | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductLookupApi()
val ean : kotlin.String = ean_example // kotlin.String | EAN code of item to return
try {
    val result : Item = apiInstance.getItemByEAN(ean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductLookupApi#getItemByEAN")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductLookupApi#getItemByEAN")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **kotlin.String**| EAN code of item to return | [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductLookupApi()
val upc : kotlin.String = upc_example // kotlin.String | UPC code of item to return
try {
    val result : Item = apiInstance.getItemByUPC(upc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductLookupApi#getItemByUPC")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductLookupApi#getItemByUPC")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **kotlin.String**| UPC code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

