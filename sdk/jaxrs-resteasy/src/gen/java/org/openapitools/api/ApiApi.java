package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-03-27T18:10:14.773-04:00[America/New_York]")
public class ApiApi  {

    @Inject ApiApiService service;

    @GET
    @Path("/v1/convert/{upc | ean | asin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Convert between UPC, EAN, and ASIN product codes.", notes = "Returns the converted UPC, EAN, and ASIN codes.", response = InlineResponse200.class, tags={ "Product Conversion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InlineResponse400.class) })
    public Response convertCode( @PathParam("upc | ean | asin") String upcEanAsin,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.convertCode(upcEanAsin,securityContext);
    }
    @GET
    @Path("/v1/asin/{asin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by asin code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByASIN( @PathParam("asin") String asin,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItemByASIN(asin,securityContext);
    }
    @GET
    @Path("/v1/ean/{ean}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByEAN( @PathParam("ean") String ean,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItemByEAN(ean,securityContext);
    }
    @GET
    @Path("/v1/upc/{upc}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByUPC( @PathParam("upc") String upc,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getItemByUPC(upc,securityContext);
    }
}
