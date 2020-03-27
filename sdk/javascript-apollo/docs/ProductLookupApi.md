# BarcodableComApi.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](ProductLookupApi.md#getItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](ProductLookupApi.md#getItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](ProductLookupApi.md#getItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code



## getItemByASIN

> Item getItemByASIN(asin)

Find item by asin code

Returns a single item

### Example

```javascript
import BarcodableComApi from 'barcodable_com_api';

let apiInstance = new BarcodableComApi.ProductLookupApi();
let asin = "asin_example"; // String | ASIN code of item to return
apiInstance.getItemByASIN(asin, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getItemByEAN

> Item getItemByEAN(ean)

Find item by UPC code

Returns a single item

### Example

```javascript
import BarcodableComApi from 'barcodable_com_api';

let apiInstance = new BarcodableComApi.ProductLookupApi();
let ean = "ean_example"; // String | EAN code of item to return
apiInstance.getItemByEAN(ean, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## getItemByUPC

> Item getItemByUPC(upc)

Find item by UPC code

Returns a single item

### Example

```javascript
import BarcodableComApi from 'barcodable_com_api';

let apiInstance = new BarcodableComApi.ProductLookupApi();
let upc = "upc_example"; // String | UPC code of item to return
apiInstance.getItemByUPC(upc, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

