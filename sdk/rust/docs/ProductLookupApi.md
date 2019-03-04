# \ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_item_by_asin**](ProductLookupApi.md#get_item_by_asin) | **Get** /api/v1/asin/{asin} | Find item by asin code
[**get_item_by_ean**](ProductLookupApi.md#get_item_by_ean) | **Get** /api/v1/ean/{ean} | Find item by UPC code
[**get_item_by_upc**](ProductLookupApi.md#get_item_by_upc) | **Get** /api/v1/upc/{upc} | Find item by UPC code


# **get_item_by_asin**
> ::models::Item get_item_by_asin(asin)
Find item by asin code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **asin** | **String**| ASIN code of item to return | 

### Return type

[**::models::Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_ean**
> ::models::Item get_item_by_ean(ean)
Find item by UPC code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **ean** | **String**| EAN code of item to return | 

### Return type

[**::models::Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_upc**
> ::models::Item get_item_by_upc(upc)
Find item by UPC code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **upc** | **String**| UPC code of item to return | 

### Return type

[**::models::Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

