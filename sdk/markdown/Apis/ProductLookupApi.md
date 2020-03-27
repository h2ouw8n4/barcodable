# ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApi.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupApi.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupApi.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="getItemByASIN"></a>
# **getItemByASIN**
> item getItemByASIN(asin)

Find item by asin code

    Returns a single item

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| ASIN code of item to return | [default to null]

### Return type

[**item**](..//Models/item.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getItemByEAN"></a>
# **getItemByEAN**
> item getItemByEAN(ean)

Find item by UPC code

    Returns a single item

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **String**| EAN code of item to return | [default to null]

### Return type

[**item**](..//Models/item.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getItemByUPC"></a>
# **getItemByUPC**
> item getItemByUPC(upc)

Find item by UPC code

    Returns a single item

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **String**| UPC code of item to return | [default to null]

### Return type

[**item**](..//Models/item.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

