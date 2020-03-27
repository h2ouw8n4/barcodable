package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class InlineResponse200 {
    /* A list of UPCs */
    List<String> upcs = new ArrayList<String>()
    /* A list of EANs */
    List<String> eans = new ArrayList<String>()
    /* A list of ASINs */
    List<String> asins = new ArrayList<String>()
    
    String message
}
