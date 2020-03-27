# PSOpenAPITools.PSOpenAPITools/Api.ProductConversionApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Convert-Code**](ProductConversionApi.md#Convert-Code) | **GET** /api/v1/convert/{upc | ean | asin} | Convert between UPC, EAN, and ASIN product codes.


<a name="Convert-Code"></a>
# **Convert-Code**
> InlineResponse200 Convert-Code<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UpcEanAsin] <String><br>

Convert between UPC, EAN, and ASIN product codes.

Returns the converted UPC, EAN, and ASIN codes.

### Example
```powershell
Import-Module -Name PSOpenAPITools

$UpcEanAsin = "UpcEanAsin_example" # String | UPC, EAN, or ASIN (default to null)

# Convert between UPC, EAN, and ASIN product codes.
try {
    InlineResponse200 $Result = Convert-Code -UpcEanAsin $UpcEanAsin
} catch {
    Write-Host ($_.ErrorDetails | ConvertFrom-Json)
    Write-Host ($_.Exception.Response.Headers | ConvertTo-Json)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UpcEanAsin** | **String**| UPC, EAN, or ASIN | [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

