# OpenAPI\Client\ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.



## convertCode

> \OpenAPI\Client\Model\InlineResponse200 convertCode($upc___ean___asin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProductConversionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$upc___ean___asin = 'upc___ean___asin_example'; // string | UPC, EAN, or ASIN

try {
    $result = $apiInstance->convertCode($upc___ean___asin);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductConversionApi->convertCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc___ean___asin** | **string**| UPC, EAN, or ASIN |

### Return type

[**\OpenAPI\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

