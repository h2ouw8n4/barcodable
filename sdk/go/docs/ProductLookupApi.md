# \ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetItemByASIN**](ProductLookupApi.md#GetItemByASIN) | **Get** /api/v1/asin/{asin} | Find item by asin code
[**GetItemByEAN**](ProductLookupApi.md#GetItemByEAN) | **Get** /api/v1/ean/{ean} | Find item by UPC code
[**GetItemByUPC**](ProductLookupApi.md#GetItemByUPC) | **Get** /api/v1/upc/{upc} | Find item by UPC code


# **GetItemByASIN**
> Item GetItemByASIN(ctx, asin)
Find item by asin code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **asin** | **string**| ASIN code of item to return | 

### Return type

[**Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetItemByEAN**
> Item GetItemByEAN(ctx, ean)
Find item by UPC code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **ean** | **string**| EAN code of item to return | 

### Return type

[**Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetItemByUPC**
> Item GetItemByUPC(ctx, upc)
Find item by UPC code

Returns a single item

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **upc** | **string**| UPC code of item to return | 

### Return type

[**Item**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

