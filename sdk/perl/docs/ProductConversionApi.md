# WWW::OpenAPIClient::ProductConversionApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ProductConversionApi;
```

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convert_code**](ProductConversionApi.md#convert_code) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convert_code**
> InlineResponse200 convert_code(upc_|_ean_|_asin => $upc_|_ean_|_asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProductConversionApi;
my $api_instance = WWW::OpenAPIClient::ProductConversionApi->new(
);

my $upc_|_ean_|_asin = "upc_|_ean_|_asin_example"; # string | UPC, EAN, or ASIN

eval { 
    my $result = $api_instance->convert_code(upc_|_ean_|_asin => $upc_|_ean_|_asin);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProductConversionApi->convert_code: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc_|_ean_|_asin** | **string**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

