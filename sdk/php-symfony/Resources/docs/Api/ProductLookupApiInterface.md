# OpenAPI\Server\Api\ProductLookupApiInterface

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApiInterface.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupApiInterface.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupApiInterface.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.productLookup:
        class: Acme\MyBundle\Api\ProductLookupApi
        tags:
            - { name: "open_api_server.api", api: "productLookup" }
    # ...
```

## **getItemByASIN**
> OpenAPI\Server\Model\Item getItemByASIN($asin)

Find item by asin code

Returns a single item

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductLookupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductLookupApiInterface;

class ProductLookupApi implements ProductLookupApiInterface
{

    // ...

    /**
     * Implementation of ProductLookupApiInterface#getItemByASIN
     */
    public function getItemByASIN($asin)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **string**| ASIN code of item to return |

### Return type

[**OpenAPI\Server\Model\Item**](../Model/Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getItemByEAN**
> OpenAPI\Server\Model\Item getItemByEAN($ean)

Find item by UPC code

Returns a single item

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductLookupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductLookupApiInterface;

class ProductLookupApi implements ProductLookupApiInterface
{

    // ...

    /**
     * Implementation of ProductLookupApiInterface#getItemByEAN
     */
    public function getItemByEAN($ean)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **string**| EAN code of item to return |

### Return type

[**OpenAPI\Server\Model\Item**](../Model/Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getItemByUPC**
> OpenAPI\Server\Model\Item getItemByUPC($upc)

Find item by UPC code

Returns a single item

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductLookupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductLookupApiInterface;

class ProductLookupApi implements ProductLookupApiInterface
{

    // ...

    /**
     * Implementation of ProductLookupApiInterface#getItemByUPC
     */
    public function getItemByUPC($upc)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **string**| UPC code of item to return |

### Return type

[**OpenAPI\Server\Model\Item**](../Model/Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

