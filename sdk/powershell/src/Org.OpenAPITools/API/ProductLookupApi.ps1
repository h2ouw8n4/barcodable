function Invoke-ProductLookupApiGetItemByASIN {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${asin}
    )

    Process {
        'Calling method: ProductLookupApi-GetItemByASIN' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProductLookupApi.GetItemByASIN(
            ${asin}
        )
    }
}

function Invoke-ProductLookupApiGetItemByEAN {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${ean}
    )

    Process {
        'Calling method: ProductLookupApi-GetItemByEAN' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProductLookupApi.GetItemByEAN(
            ${ean}
        )
    }
}

function Invoke-ProductLookupApiGetItemByUPC {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${upc}
    )

    Process {
        'Calling method: ProductLookupApi-GetItemByUPC' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:ProductLookupApi.GetItemByUPC(
            ${upc}
        )
    }
}

