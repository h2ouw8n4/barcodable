# InlineResponse200
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Upcs** | **String[]** | A list of UPCs | [optional] [default to null]
**Eans** | **String[]** | A list of EANs | [optional] [default to null]
**Asins** | **String[]** | A list of ASINs | [optional] [default to null]
**Message** | **String** |  | [optional] [default to null]

## Examples

- Create a new object
```powershell
New-PSOpenAPIToolsInlineResponse200  -Upcs [&quot;190198155795&quot;] `
 -Eans [1.90198155795E11] `
 -Asins [&quot;B01M1EXQY4&quot;] `
 -Message OK
```

- Convert the object to JSON
```powershell
$ | Convert-ToJSON
```


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

