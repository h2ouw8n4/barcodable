function Invoke-ProductConversionApiConvertCode {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${upc Pipe ean Pipe asin}
    )

    Process {
        'Calling method: ProductConversionApi-ConvertCode' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProductConversionApi.ConvertCode(
            ${upc Pipe ean Pipe asin}
        )
    }
}

