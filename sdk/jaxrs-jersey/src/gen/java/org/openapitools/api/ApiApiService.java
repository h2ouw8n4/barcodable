package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-03-27T18:10:13.410-04:00[America/New_York]")
public abstract class ApiApiService {
    public abstract Response convertCode(String upcEanAsin,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getItemByASIN(String asin,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getItemByEAN(String ean,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getItemByUPC(String upc,SecurityContext securityContext) throws NotFoundException;
}
