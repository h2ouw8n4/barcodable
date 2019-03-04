package org.openapitools.api;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Barcodable.com API
 *
 * <p>Barcodable.com API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ProductConversionApi  {

    /**
     * Convert between UPC, EAN, and ASIN product codes.
     *
     * Returns the converted UPC, EAN, and ASIN codes.
     *
     */
    @GET
    @Path("/api/v1/convert/{upc | ean | asin}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Convert between UPC, EAN, and ASIN product codes.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InlineResponse400.class) })
    public InlineResponse200 convertCode(@PathParam("upc | ean | asin") String upcEanAsin);
}

