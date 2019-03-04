package org.openapitools.api;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;
import org.openapitools.api.ApiApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/api")
@RequestScoped

@Api(description = "the api API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-04T22:39:04.582Z[Etc/UTC]")

public class ApiApi  {

  @Context SecurityContext securityContext;

  @Inject ApiApiService delegate;


    @GET
    @Path("/v1/convert/{upc | ean | asin}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Convert between UPC, EAN, and ASIN product codes.", notes = "Returns the converted UPC, EAN, and ASIN codes.", response = InlineResponse200.class, tags={ "Product Conversion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InlineResponse400.class) })
    public Response convertCode(@ApiParam(value = "UPC, EAN, or ASIN",required=true) @PathParam("upc | ean | asin") String upcEanAsin) {
        return delegate.convertCode(upcEanAsin, securityContext);
    }

    @GET
    @Path("/v1/asin/{asin}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by asin code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByASIN(@ApiParam(value = "ASIN code of item to return",required=true) @PathParam("asin") String asin) {
        return delegate.getItemByASIN(asin, securityContext);
    }

    @GET
    @Path("/v1/ean/{ean}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByEAN(@ApiParam(value = "EAN code of item to return",required=true) @PathParam("ean") String ean) {
        return delegate.getItemByEAN(ean, securityContext);
    }

    @GET
    @Path("/v1/upc/{upc}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByUPC(@ApiParam(value = "UPC code of item to return",required=true) @PathParam("upc") String upc) {
        return delegate.getItemByUPC(upc, securityContext);
    }
}
