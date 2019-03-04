# OAIProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getItemByASIN**](OAIProductLookupApi.md#getitembyasin) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**getItemByEAN**](OAIProductLookupApi.md#getitembyean) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**getItemByUPC**](OAIProductLookupApi.md#getitembyupc) | **GET** /api/v1/upc/{upc} | Find item by UPC code


# **getItemByASIN**
```objc
-(NSURLSessionTask*) getItemByASINWithAsin: (NSString*) asin
        completionHandler: (void (^)(OAIItem* output, NSError* error)) handler;
```

Find item by asin code

Returns a single item

### Example 
```objc

NSString* asin = @"asin_example"; // ASIN code of item to return

OAIProductLookupApi*apiInstance = [[OAIProductLookupApi alloc] init];

// Find item by asin code
[apiInstance getItemByASINWithAsin:asin
          completionHandler: ^(OAIItem* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductLookupApi->getItemByASIN: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **NSString***| ASIN code of item to return | 

### Return type

[**OAIItem***](OAIItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByEAN**
```objc
-(NSURLSessionTask*) getItemByEANWithEan: (NSString*) ean
        completionHandler: (void (^)(OAIItem* output, NSError* error)) handler;
```

Find item by UPC code

Returns a single item

### Example 
```objc

NSString* ean = @"ean_example"; // EAN code of item to return

OAIProductLookupApi*apiInstance = [[OAIProductLookupApi alloc] init];

// Find item by UPC code
[apiInstance getItemByEANWithEan:ean
          completionHandler: ^(OAIItem* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductLookupApi->getItemByEAN: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ean** | **NSString***| EAN code of item to return | 

### Return type

[**OAIItem***](OAIItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getItemByUPC**
```objc
-(NSURLSessionTask*) getItemByUPCWithUpc: (NSString*) upc
        completionHandler: (void (^)(OAIItem* output, NSError* error)) handler;
```

Find item by UPC code

Returns a single item

### Example 
```objc

NSString* upc = @"upc_example"; // UPC code of item to return

OAIProductLookupApi*apiInstance = [[OAIProductLookupApi alloc] init];

// Find item by UPC code
[apiInstance getItemByUPCWithUpc:upc
          completionHandler: ^(OAIItem* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductLookupApi->getItemByUPC: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upc** | **NSString***| UPC code of item to return | 

### Return type

[**OAIItem***](OAIItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

