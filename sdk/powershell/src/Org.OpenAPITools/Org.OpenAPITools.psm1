#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: Org.OpenAPITools.Api.ProductConversionApi' | Write-Verbose
$Script:ProductConversionApi= New-Object -TypeName Org.OpenAPITools.Api.ProductConversionApi -ArgumentList @($null)

'Creating object: Org.OpenAPITools.Api.ProductLookupApi' | Write-Verbose
$Script:ProductLookupApi= New-Object -TypeName Org.OpenAPITools.Api.ProductLookupApi -ArgumentList @($null)


#endregion
