function New-InlineResponse200 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${upcs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${eans},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${asins},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${message}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineResponse200' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineResponse200 -ArgumentList @(
            ${upcs},
            ${eans},
            ${asins},
            ${message}
        )
    }
}
