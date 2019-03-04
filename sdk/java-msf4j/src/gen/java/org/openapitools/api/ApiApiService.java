package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-04T22:38:51.388Z[Etc/UTC]")
public abstract class ApiApiService {
    public abstract Response convertCode(String upcEanAsin
 ) throws NotFoundException;
    public abstract Response getItemByASIN(String asin
 ) throws NotFoundException;
    public abstract Response getItemByEAN(String ean
 ) throws NotFoundException;
    public abstract Response getItemByUPC(String upc
 ) throws NotFoundException;
}
