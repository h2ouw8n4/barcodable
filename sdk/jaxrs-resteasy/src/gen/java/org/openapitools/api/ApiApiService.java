package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-03-27T18:10:14.773-04:00[America/New_York]")
public interface ApiApiService {
      Response convertCode(String upcEanAsin,SecurityContext securityContext)
      throws NotFoundException;
      Response getItemByASIN(String asin,SecurityContext securityContext)
      throws NotFoundException;
      Response getItemByEAN(String ean,SecurityContext securityContext)
      throws NotFoundException;
      Response getItemByUPC(String upc,SecurityContext securityContext)
      throws NotFoundException;
}
