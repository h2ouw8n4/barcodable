# Documentation for Barcodable.com API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductConversionApi* | [**convertCode**](Apis/ProductConversionApi.md#convertcode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.
*ProductLookupApi* | [**getItemByASIN**](Apis/ProductLookupApi.md#getitembyasin) | **GET** /api/v1/asin/{asin} | Find item by asin code
*ProductLookupApi* | [**getItemByEAN**](Apis/ProductLookupApi.md#getitembyean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
*ProductLookupApi* | [**getItemByUPC**](Apis/ProductLookupApi.md#getitembyupc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="documentation-for-models"></a>
## Documentation for Models

 - [InlineResponse200](.//Models/InlineResponse200.md)
 - [InlineResponse400](.//Models/InlineResponse400.md)
 - [InvalidCode](.//Models/InvalidCode.md)
 - [Item](.//Models/Item.md)
 - [NotFound](.//Models/NotFound.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

