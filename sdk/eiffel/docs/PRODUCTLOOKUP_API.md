# PRODUCTLOOKUP_API

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**item_by_as_in**](PRODUCTLOOKUP_API.md#item_by_as_in) | **Get** /api/v1/asin/{asin} | Find item by asin code
[**item_by_ea_n**](PRODUCTLOOKUP_API.md#item_by_ea_n) | **Get** /api/v1/ean/{ean} | Find item by UPC code
[**item_by_up_c**](PRODUCTLOOKUP_API.md#item_by_up_c) | **Get** /api/v1/upc/{upc} | Find item by UPC code


# **item_by_as_in**
> item_by_as_in (asin: STRING_32 ): detachable ITEM
	

Find item by asin code

Returns a single item


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **STRING_32**| ASIN code of item to return | [default to null]

### Return type

[**ITEM**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_by_ea_n**
> item_by_ea_n (ean: STRING_32 ): detachable ITEM
	

Find item by UPC code

Returns a single item


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **STRING_32**| EAN code of item to return | [default to null]

### Return type

[**ITEM**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_by_up_c**
> item_by_up_c (upc: STRING_32 ): detachable ITEM
	

Find item by UPC code

Returns a single item


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **STRING_32**| UPC code of item to return | [default to null]

### Return type

[**ITEM**](item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

