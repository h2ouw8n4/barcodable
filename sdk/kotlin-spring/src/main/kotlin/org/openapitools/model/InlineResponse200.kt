package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param upcs A list of UPCs
 * @param eans A list of EANs
 * @param asins A list of ASINs
 * @param message 
 */
data class InlineResponse200 (

        @JsonProperty("upcs") val upcs: List<String>? = null,

        @JsonProperty("eans") val eans: List<String>? = null,

        @JsonProperty("asins") val asins: List<String>? = null,

        @JsonProperty("message") val message: String? = null
) {

}

