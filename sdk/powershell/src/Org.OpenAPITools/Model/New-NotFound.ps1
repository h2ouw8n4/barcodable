function New-NotFound {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${message},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${status}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.NotFound' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.NotFound -ArgumentList @(
            ${message},
            ${status}
        )
    }
}
