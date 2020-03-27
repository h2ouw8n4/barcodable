package org.openapitools.api

import org.openapitools.model.InvalidCode
import org.openapitools.model.Item
import org.openapitools.model.NotFound
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class ProductLookupApiTest {

    
    private val api: ProductLookupApiController = ProductLookupApiController()

    
    /**
    * Find item by asin code
    *
    * Returns a single item
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getItemByASINTest() {
        val asin:kotlin.String? = null
        val response: ResponseEntity<Item> = api.getItemByASIN(asin!!)

        // TODO: test validations
    }
    
    /**
    * Find item by UPC code
    *
    * Returns a single item
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getItemByEANTest() {
        val ean:kotlin.String? = null
        val response: ResponseEntity<Item> = api.getItemByEAN(ean!!)

        // TODO: test validations
    }
    
    /**
    * Find item by UPC code
    *
    * Returns a single item
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getItemByUPCTest() {
        val upc:kotlin.String? = null
        val response: ResponseEntity<Item> = api.getItemByUPC(upc!!)

        // TODO: test validations
    }
    
}
