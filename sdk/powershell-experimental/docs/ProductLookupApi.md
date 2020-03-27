# PSOpenAPITools.PSOpenAPITools/Api.ProductLookupApi

All URIs are relative to *https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-ItemByASIN**](ProductLookupApi.md#Get-ItemByASIN) | **GET** /api/v1/asin/{asin} | Find item by asin code
[**Get-ItemByEAN**](ProductLookupApi.md#Get-ItemByEAN) | **GET** /api/v1/ean/{ean} | Find item by UPC code
[**Get-ItemByUPC**](ProductLookupApi.md#Get-ItemByUPC) | **GET** /api/v1/upc/{upc} | Find item by UPC code


<a name="Get-ItemByASIN"></a>
# **Get-ItemByASIN**
> Item Get-ItemByASIN<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Asin] <String><br>

Find item by asin code

Returns a single item

### Example
```powershell
Import-Module -Name PSOpenAPITools

$Asin = "Asin_example" # String | ASIN code of item to return (default to null)

# Find item by asin code
try {
    Item $Result = Get-ItemByASIN -Asin $Asin
} catch {
    Write-Host ($_.ErrorDetails | ConvertFrom-Json)
    Write-Host ($_.Exception.Response.Headers | ConvertTo-Json)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Asin** | **String**| ASIN code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-ItemByEAN"></a>
# **Get-ItemByEAN**
> Item Get-ItemByEAN<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Ean] <String><br>

Find item by UPC code

Returns a single item

### Example
```powershell
Import-Module -Name PSOpenAPITools

$Ean = "Ean_example" # String | EAN code of item to return (default to null)

# Find item by UPC code
try {
    Item $Result = Get-ItemByEAN -Ean $Ean
} catch {
    Write-Host ($_.ErrorDetails | ConvertFrom-Json)
    Write-Host ($_.Exception.Response.Headers | ConvertTo-Json)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Ean** | **String**| EAN code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Get-ItemByUPC"></a>
# **Get-ItemByUPC**
> Item Get-ItemByUPC<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Upc] <String><br>

Find item by UPC code

Returns a single item

### Example
```powershell
Import-Module -Name PSOpenAPITools

$Upc = "Upc_example" # String | UPC code of item to return (default to null)

# Find item by UPC code
try {
    Item $Result = Get-ItemByUPC -Upc $Upc
} catch {
    Write-Host ($_.ErrorDetails | ConvertFrom-Json)
    Write-Host ($_.Exception.Response.Headers | ConvertTo-Json)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Upc** | **String**| UPC code of item to return | [default to null]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

