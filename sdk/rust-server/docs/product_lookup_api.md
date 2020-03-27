# product_lookup_api

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
**getItemByASIN**](product_lookup_api.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
**getItemByEAN**](product_lookup_api.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
**getItemByUPC**](product_lookup_api.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **getItemByASIN**
> models::Item getItemByASIN(asin)
Find item by asin code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **asin** | **String**| ASIN code of item to return | 

### Return type

[**models::Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByEAN**
> models::Item getItemByEAN(ean)
Find item by UPC code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **ean** | **String**| EAN code of item to return | 

### Return type

[**models::Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, 

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByUPC**
> models::Item getItemByUPC(upc)
Find item by UPC code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **upc** | **String**| UPC code of item to return | 

### Return type

[**models::Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

