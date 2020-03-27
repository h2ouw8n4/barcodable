# org.openapitools - Kotlin Server library for Barcodable.com API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

    <a name="documentation-for-api-endpoints"></a>
    ## Documentation for API Endpoints

    All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

    Class | Method | HTTP request | Description
    ------------ | ------------- | ------------- | -------------
    *ProductConversionApi* | [**convertCode**](docs/ProductConversionApi.md#convertcode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.
    *ProductLookupApi* | [**getItemByASIN**](docs/ProductLookupApi.md#getitembyasin) | **GET** /api/v1/asin/{asin} | Find item by asin code
    *ProductLookupApi* | [**getItemByEAN**](docs/ProductLookupApi.md#getitembyean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
    *ProductLookupApi* | [**getItemByUPC**](docs/ProductLookupApi.md#getitembyupc) | **GET** /api/v1/upc/{upc} | Find item by UPC code
    

    <a name="documentation-for-models"></a>
    ## Documentation for Models

         - [org.openapitools.server.api.model.InlineResponse200](docs/InlineResponse200.md)
         - [org.openapitools.server.api.model.InlineResponse400](docs/InlineResponse400.md)
         - [org.openapitools.server.api.model.InvalidCode](docs/InvalidCode.md)
         - [org.openapitools.server.api.model.Item](docs/Item.md)
         - [org.openapitools.server.api.model.NotFound](docs/NotFound.md)
        

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

    <a name="ApiKeyAuth"></a>
    ### ApiKeyAuth

    - **Type**: API key
    - **API key parameter name**: Authorization
    - **Location**: HTTP header
        
