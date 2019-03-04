# product_conversion_api

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConvertCode**](product_conversion_api.md#ConvertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="ConvertCode"></a>
# **ConvertCode**
> InlineResponse200 ConvertCode(upcEanAsin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.
