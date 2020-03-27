package org.openapitools.api

import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse400
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class ProductConversionApiTest {

    
    private val api: ProductConversionApiController = ProductConversionApiController()

    
    /**
    * Convert between UPC, EAN, and ASIN product codes.
    *
    * Returns the converted UPC, EAN, and ASIN codes.
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun convertCodeTest() {
        val upcPipeEanPipeAsin:kotlin.String? = null
        val response: ResponseEntity<InlineResponse200> = api.convertCode(upcPipeEanPipeAsin!!)

        // TODO: test validations
    }
    
}
