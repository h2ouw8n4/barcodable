# OpenAPI\Server\Api\ProductConversionApiInterface

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApiInterface.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.productConversion:
        class: Acme\MyBundle\Api\ProductConversionApi
        tags:
            - { name: "open_apiserver.api", api: "productConversion" }
    # ...
```

## **convertCode**
> OpenAPI\Server\Model\InlineResponse200 convertCode($upcEanAsin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductConversionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductConversionApiInterface;

class ProductConversionApi implements ProductConversionApiInterface
{

    // ...

    /**
     * Implementation of ProductConversionApiInterface#convertCode
     */
    public function convertCode($upcEanAsin)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcEanAsin** | **string**| UPC, EAN, or ASIN |

### Return type

[**OpenAPI\Server\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

