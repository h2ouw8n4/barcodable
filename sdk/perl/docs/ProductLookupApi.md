# WWW::OpenAPIClient::ProductLookupApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ProductLookupApi;
```

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_item_by_asin**](ProductLookupApi.md#get_item_by_asin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**get_item_by_ean**](ProductLookupApi.md#get_item_by_ean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**get_item_by_upc**](ProductLookupApi.md#get_item_by_upc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **get_item_by_asin**
> Item get_item_by_asin(asin => $asin)

Find item by asin code

Returns a single item

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductLookupApi;
my $api_instance = WWW::OpenAPIClient::ProductLookupApi->new(
);

my $asin = "asin_example"; # string | ASIN code of item to return

eval { 
    my $result = $api_instance->get_item_by_asin(asin => $asin);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductLookupApi->get_item_by_asin: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **string**| ASIN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_ean**
> Item get_item_by_ean(ean => $ean)

Find item by UPC code

Returns a single item

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductLookupApi;
my $api_instance = WWW::OpenAPIClient::ProductLookupApi->new(
);

my $ean = "ean_example"; # string | EAN code of item to return

eval { 
    my $result = $api_instance->get_item_by_ean(ean => $ean);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductLookupApi->get_item_by_ean: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **string**| EAN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_by_upc**
> Item get_item_by_upc(upc => $upc)

Find item by UPC code

Returns a single item

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductLookupApi;
my $api_instance = WWW::OpenAPIClient::ProductLookupApi->new(
);

my $upc = "upc_example"; # string | UPC code of item to return

eval { 
    my $result = $api_instance->get_item_by_upc(upc => $upc);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductLookupApi->get_item_by_upc: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **string**| UPC code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

