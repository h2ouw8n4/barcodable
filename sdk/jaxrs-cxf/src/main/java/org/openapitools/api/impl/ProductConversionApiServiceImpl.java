package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;

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
public class ProductConversionApiServiceImpl implements ProductConversionApi {
    /**
     * Convert between UPC, EAN, and ASIN product codes.
     *
     * Returns the converted UPC, EAN, and ASIN codes.
     *
     */
    public InlineResponse200 convertCode(String upcEanAsin) {
        // TODO: Implement...
        
        return null;
    }
    
}

