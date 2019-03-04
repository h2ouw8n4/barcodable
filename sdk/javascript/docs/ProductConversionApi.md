# BarcodablecomApi.ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](ProductConversionApi.md#convertCode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="convertCode"></a>
# **convertCode**
> InlineResponse200 convertCode(upcEanAsin)

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```javascript
var BarcodablecomApi = require('barcodablecom_api');

var apiInstance = new BarcodablecomApi.ProductConversionApi();
var upcEanAsin = "upcEanAsin_example"; // String | UPC, EAN, or ASIN
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.convertCode(upcEanAsin, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcEanAsin** | **String**| UPC, EAN, or ASIN | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

