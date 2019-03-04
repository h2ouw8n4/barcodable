function New-Item {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${upc},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ean},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${isbn},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${asin},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${sku},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${mpn},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${partUnderscorenumber},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${upcs},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${brand},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${manufacturer},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${color},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${newUnderscoreprice},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${usedUnderscoreprice},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${currencyUnderscorecode},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${url},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${features},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${dimensions},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${images},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${matchedUnderscoreitems},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${isoUnderscorecountryUnderscorecodes},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${companyUnderscorename},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${companyUnderscoreaddress},
        [Parameter(Position = 24, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${categories},
        [Parameter(Position = 25, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String[]]]
        ${categoryUnderscorehierarchies}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Item' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Item -ArgumentList @(
            ${upc},
            ${ean},
            ${isbn},
            ${asin},
            ${title},
            ${sku},
            ${mpn},
            ${partUnderscorenumber},
            ${upcs},
            ${description},
            ${brand},
            ${manufacturer},
            ${color},
            ${newUnderscoreprice},
            ${usedUnderscoreprice},
            ${currencyUnderscorecode},
            ${url},
            ${features},
            ${dimensions},
            ${images},
            ${matchedUnderscoreitems},
            ${isoUnderscorecountryUnderscorecodes},
            ${companyUnderscorename},
            ${companyUnderscoreaddress},
            ${categories},
            ${categoryUnderscorehierarchies}
        )
    }
}
