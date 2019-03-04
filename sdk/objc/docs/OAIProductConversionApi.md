# OAIProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertCode**](OAIProductConversionApi.md#convertcode) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


# **convertCode**
```objc
-(NSURLSessionTask*) convertCodeWithUpcEanAsin: (NSString*) upcEanAsin
        completionHandler: (void (^)(OAIInlineResponse200* output, NSError* error)) handler;
```

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example 
```objc

NSString* upcEanAsin = @"upcEanAsin_example"; // UPC, EAN, or ASIN

OAIProductConversionApi*apiInstance = [[OAIProductConversionApi alloc] init];

// Convert between UPC, EAN, and ASIN product codes.
[apiInstance convertCodeWithUpcEanAsin:upcEanAsin
          completionHandler: ^(OAIInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProductConversionApi->convertCode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upcEanAsin** | **NSString***| UPC, EAN, or ASIN | 

### Return type

[**OAIInlineResponse200***](OAIInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

