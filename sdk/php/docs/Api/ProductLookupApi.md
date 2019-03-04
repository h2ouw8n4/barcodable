# OpenAPI\Client\ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApi.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupApi.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupApi.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **getItemByASIN**
> \OpenAPI\Client\Model\Item getItemByASIN($asin)

Find item by asin code

Returns a single item

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProductLookupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$asin = 'asin_example'; // string | ASIN code of item to return

try {
    $result = $apiInstance->getItemByASIN($asin);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductLookupApi->getItemByASIN: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **string**| ASIN code of item to return |

### Return type

[**\OpenAPI\Client\Model\Item**](../Model/Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getItemByEAN**
> \OpenAPI\Client\Model\Item getItemByEAN($ean)

Find item by UPC code

Returns a single item

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProductLookupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ean = 'ean_example'; // string | EAN code of item to return

try {
    $result = $apiInstance->getItemByEAN($ean);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductLookupApi->getItemByEAN: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **string**| EAN code of item to return |

### Return type

[**\OpenAPI\Client\Model\Item**](../Model/Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getItemByUPC**
> \OpenAPI\Client\Model\Item getItemByUPC($upc)

Find item by UPC code

Returns a single item

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ProductLookupApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$upc = 'upc_example'; // string | UPC code of item to return

try {
    $result = $apiInstance->getItemByUPC($upc);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductLookupApi->getItemByUPC: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **string**| UPC code of item to return |

### Return type

[**\OpenAPI\Client\Model\Item**](../Model/Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

