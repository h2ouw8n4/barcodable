package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InvalidCode;
import org.openapitools.model.Item;
import org.openapitools.model.NotFound;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-03-27T18:10:12.020-04:00[America/New_York]")
public interface ApiApiService {
      public Response convertCode(String upcEanAsin, SecurityContext securityContext);
      public Response getItemByASIN(String asin, SecurityContext securityContext);
      public Response getItemByEAN(String ean, SecurityContext securityContext);
      public Response getItemByUPC(String upc, SecurityContext securityContext);
}
