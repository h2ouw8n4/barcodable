# BarcodablecomApi.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/mindviser/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApi.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupApi.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupApi.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="getItemByASIN"></a>
# **getItemByASIN**
> Item getItemByASIN(asin)

Find item by asin code

Returns a single item

### Example
```javascript
var BarcodablecomApi = require('barcodablecom_api');

var apiInstance = new BarcodablecomApi.ProductLookupApi();
var asin = "asin_example"; // String | ASIN code of item to return
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getItemByASIN(asin, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| ASIN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemByEAN"></a>
# **getItemByEAN**
> Item getItemByEAN(ean)

Find item by UPC code

Returns a single item

### Example
```javascript
var BarcodablecomApi = require('barcodablecom_api');

var apiInstance = new BarcodablecomApi.ProductLookupApi();
var ean = "ean_example"; // String | EAN code of item to return
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getItemByEAN(ean, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **String**| EAN code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemByUPC"></a>
# **getItemByUPC**
> Item getItemByUPC(upc)

Find item by UPC code

Returns a single item

### Example
```javascript
var BarcodablecomApi = require('barcodablecom_api');

var apiInstance = new BarcodablecomApi.ProductLookupApi();
var upc = "upc_example"; // String | UPC code of item to return
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getItemByUPC(upc, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **String**| UPC code of item to return | 

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

