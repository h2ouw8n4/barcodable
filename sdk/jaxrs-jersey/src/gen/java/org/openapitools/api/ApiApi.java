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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-03-27T18:10:13.410-04:00[America/New_York]")
public class ApiApi  {
   private final ApiApiService delegate;

   public ApiApi(@Context ServletConfig servletContext) {
      ApiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApiApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ApiApiServiceFactory.getApiApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/v1/convert/{upc | ean | asin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Convert between UPC, EAN, and ASIN product codes.", notes = "Returns the converted UPC, EAN, and ASIN codes.", response = InlineResponse200.class, tags={ "Product Conversion", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InlineResponse400.class) })
    public Response convertCode(@ApiParam(value = "UPC, EAN, or ASIN", required = true) @PathParam("upc | ean | asin") @NotNull  String upcEanAsin
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.convertCode(upcEanAsin, securityContext);
    }
    @GET
    @Path("/v1/asin/{asin}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by asin code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByASIN(@ApiParam(value = "ASIN code of item to return", required = true) @PathParam("asin") @NotNull  String asin
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getItemByASIN(asin, securityContext);
    }
    @GET
    @Path("/v1/ean/{ean}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByEAN(@ApiParam(value = "EAN code of item to return", required = true) @PathParam("ean") @NotNull  String ean
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getItemByEAN(ean, securityContext);
    }
    @GET
    @Path("/v1/upc/{upc}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Item.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class) })
    public Response getItemByUPC(@ApiParam(value = "UPC code of item to return", required = true) @PathParam("upc") @NotNull  String upc
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getItemByUPC(upc, securityContext);
    }
}
