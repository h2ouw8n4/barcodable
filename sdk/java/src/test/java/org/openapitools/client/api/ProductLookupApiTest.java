/*
 * Barcodable.com API
 * Barcodable.com API
 *
 * OpenAPI spec version: 1.5.0
 * Contact: support@barcodable.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InvalidCode;
import org.openapitools.client.model.Item;
import org.openapitools.client.model.NotFound;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductLookupApi
 */
@Ignore
public class ProductLookupApiTest {

    private final ProductLookupApi api = new ProductLookupApi();

    
    /**
     * Find item by asin code
     *
     * Returns a single item
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemByASINTest() throws ApiException {
        String asin = null;
        Item response = api.getItemByASIN(asin);

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
    public void getItemByEANTest() throws ApiException {
        String ean = null;
        Item response = api.getItemByEAN(ean);

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
    public void getItemByUPCTest() throws ApiException {
        String upc = null;
        Item response = api.getItemByUPC(upc);

        // TODO: test validations
    }
    
}
