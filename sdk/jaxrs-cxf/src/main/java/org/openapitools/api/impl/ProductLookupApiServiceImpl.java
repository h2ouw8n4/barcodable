package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Barcodable.com API
 *
 * <p>Barcodable.com API
 *
 */
public class ProductLookupApiServiceImpl implements ProductLookupApi {
    /**
     * Find item by asin code
     *
     * Returns a single item
     *
     */
    public Item getItemByASIN(String asin) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find item by UPC code
     *
     * Returns a single item
     *
     */
    public Item getItemByEAN(String ean) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find item by UPC code
     *
     * Returns a single item
     *
     */
    public Item getItemByUPC(String upc) {
        // TODO: Implement...
        
        return null;
    }
    
}

