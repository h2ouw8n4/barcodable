# org.openapitools.client - Kotlin client library for Barcodable.com API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductConversionApi* | [**convertCode**](docs/ProductConversionApi.md#convertcode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.
*ProductLookupApi* | [**getItemByASIN**](docs/ProductLookupApi.md#getitembyasin) | **GET** /api/v1/asin/{asin} | Find item by asin code
*ProductLookupApi* | [**getItemByEAN**](docs/ProductLookupApi.md#getitembyean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
*ProductLookupApi* | [**getItemByUPC**](docs/ProductLookupApi.md#getitembyupc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [org.openapitools.client.models.InlineResponse400](docs/InlineResponse400.md)
 - [org.openapitools.client.models.InvalidCode](docs/InvalidCode.md)
 - [org.openapitools.client.models.Item](docs/Item.md)
 - [org.openapitools.client.models.NotFound](docs/NotFound.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

