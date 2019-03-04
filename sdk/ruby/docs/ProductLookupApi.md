# OpenapiClient::ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_item_by_asin**](ProductLookupApi.md#get_item_by_asin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**get_item_by_ean**](ProductLookupApi.md#get_item_by_ean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**get_item_by_upc**](ProductLookupApi.md#get_item_by_upc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **get_item_by_asin**
> Item get_item_by_asin(asin)

Find item by asin code

Returns a single item

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::ProductLookupApi.new
asin = 'asin_example' # String | ASIN code of item to return

begin
  #Find item by asin code
  result = api_instance.get_item_by_asin(asin)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ProductLookupApi->get_item_by_asin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| ASIN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_item_by_ean**
> Item get_item_by_ean(ean)

Find item by UPC code

Returns a single item

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::ProductLookupApi.new
ean = 'ean_example' # String | EAN code of item to return

begin
  #Find item by UPC code
  result = api_instance.get_item_by_ean(ean)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ProductLookupApi->get_item_by_ean: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **String**| EAN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_item_by_upc**
> Item get_item_by_upc(upc)

Find item by UPC code

Returns a single item

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::ProductLookupApi.new
upc = 'upc_example' # String | UPC code of item to return

begin
  #Find item by UPC code
  result = api_instance.get_item_by_upc(upc)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ProductLookupApi->get_item_by_upc: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **String**| UPC code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



