package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param message 
 * @param status 
 */
data class InlineResponse400 (

        @JsonProperty("message") val message: String? = null,

        @JsonProperty("status") val status: Int? = null
) {

}

