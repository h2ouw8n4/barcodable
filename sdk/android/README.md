# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.ProductConversionApi;

public class ProductConversionApiExample {

    public static void main(String[] args) {
        ProductConversionApi apiInstance = new ProductConversionApi();
        String upcEanAsin = null; // String | UPC, EAN, or ASIN
        try {
            InlineResponse200 result = apiInstance.convertCode(upcEanAsin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductConversionApi#convertCode");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProductConversionApi* | [**convertCode**](docs/ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.
*ProductLookupApi* | [**getItemByASIN**](docs/ProductLookupApi.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
*ProductLookupApi* | [**getItemByEAN**](docs/ProductLookupApi.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
*ProductLookupApi* | [**getItemByUPC**](docs/ProductLookupApi.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


## Documentation for Models

 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InvalidCode](docs/InvalidCode.md)
 - [Item](docs/Item.md)
 - [NotFound](docs/NotFound.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key

- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@barcodable.com

