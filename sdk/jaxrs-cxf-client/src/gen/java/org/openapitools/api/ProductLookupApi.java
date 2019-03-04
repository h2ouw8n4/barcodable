package org.openapitools.api;

import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

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
public interface ProductLookupApi  {

    /**
     * Find item by asin code
     *
     * Returns a single item
     *
     */
    @GET
    @Path("/api/v1/asin/{asin}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by asin code", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Item getItemByASIN(@PathParam("asin") String asin);

    /**
     * Find item by UPC code
     *
     * Returns a single item
     *
     */
    @GET
    @Path("/api/v1/ean/{ean}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by UPC code", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Item getItemByEAN(@PathParam("ean") String ean);

    /**
     * Find item by UPC code
     *
     * Returns a single item
     *
     */
    @GET
    @Path("/api/v1/upc/{upc}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by UPC code", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Item getItemByUPC(@PathParam("upc") String upc);
}

