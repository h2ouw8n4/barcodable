package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;
import org.openapitools.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-03-27T18:10:01.193-04:00[America/New_York]")
public class ApiApi  {
   private final ApiApiService delegate = ApiApiServiceFactory.getApiApi();

    @GET
    @Path("/v1/convert/{upc | ean | asin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Convert between UPC, EAN, and ASIN product codes.", notes = "Returns the converted UPC, EAN, and ASIN codes.", response = InlineResponse200.class, tags={ "Product Conversion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InlineResponse200.class) })
    public Response convertCode(@ApiParam(value = "UPC, EAN, or ASIN",required=true) @PathParam("upc | ean | asin") String upcEanAsin
)
    throws NotFoundException {
        return delegate.convertCode(upcEanAsin);
    }
    @GET
    @Path("/v1/asin/{asin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by asin code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = Item.class) })
    public Response getItemByASIN(@ApiParam(value = "ASIN code of item to return",required=true) @PathParam("asin") String asin
)
    throws NotFoundException {
        return delegate.getItemByASIN(asin);
    }
    @GET
    @Path("/v1/ean/{ean}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = Item.class) })
    public Response getItemByEAN(@ApiParam(value = "EAN code of item to return",required=true) @PathParam("ean") String ean
)
    throws NotFoundException {
        return delegate.getItemByEAN(ean);
    }
    @GET
    @Path("/v1/upc/{upc}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = Item.class) })
    public Response getItemByUPC(@ApiParam(value = "UPC code of item to return",required=true) @PathParam("upc") String upc
)
    throws NotFoundException {
        return delegate.getItemByUPC(upc);
    }
}
