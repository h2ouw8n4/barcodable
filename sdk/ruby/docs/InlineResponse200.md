# OpenapiClient::InlineResponse200

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upcs** | **Array&lt;String&gt;** | A list of UPCs | [optional] 
**eans** | **Array&lt;String&gt;** | A list of EANs | [optional] 
**asins** | **Array&lt;String&gt;** | A list of ASINs | [optional] 
**message** | **String** |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse200.new(upcs: [&quot;190198155795&quot;],
                                 eans: [1.90198155795E11],
                                 asins: [&quot;B01M1EXQY4&quot;],
                                 message: OK)
```


