package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param upcs A list of UPCs
 * @param eans A list of EANs
 * @param asins A list of ASINs
 * @param message 
 */
data class InlineResponse200(

    @JsonProperty("upcs") val upcs: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("eans") val eans: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("asins") val asins: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("message") val message: kotlin.String? = null
) {

}

