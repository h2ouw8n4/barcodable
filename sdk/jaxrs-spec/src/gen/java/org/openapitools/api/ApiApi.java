package org.openapitools.api;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")
@Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-04T22:39:14.042Z[Etc/UTC]")
public class ApiApi {

    @GET
    @Path("/v1/convert/{upc | ean | asin}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Convert between UPC, EAN, and ASIN product codes.", notes = "Returns the converted UPC, EAN, and ASIN codes.", response = InlineResponse200.class, tags={ "Product Conversion",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InlineResponse400.class)
    })
    public Response convertCode(@PathParam("upc | ean | asin") @ApiParam("UPC, EAN, or ASIN") String upcEanAsin) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/v1/asin/{asin}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by asin code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class)
    })
    public Response getItemByASIN(@PathParam("asin") @ApiParam("ASIN code of item to return") String asin) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/v1/ean/{ean}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class)
    })
    public Response getItemByEAN(@PathParam("ean") @ApiParam("EAN code of item to return") String ean) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/v1/upc/{upc}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find item by UPC code", notes = "Returns a single item", response = Item.class, tags={ "Product Lookup" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Item.class),
        @ApiResponse(code = 400, message = "search results matching criteria", response = InvalidCode.class),
        @ApiResponse(code = 404, message = "search results matching criteria", response = NotFound.class)
    })
    public Response getItemByUPC(@PathParam("upc") @ApiParam("UPC code of item to return") String upc) {
        return Response.ok().entity("magic!").build();
    }
}
