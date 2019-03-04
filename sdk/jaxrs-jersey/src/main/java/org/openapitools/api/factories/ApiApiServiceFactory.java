package org.openapitools.api.factories;

import org.openapitools.api.ApiApiService;
import org.openapitools.api.impl.ApiApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-04T22:39:07.141Z[Etc/UTC]")
public class ApiApiServiceFactory {
    private final static ApiApiService service = new ApiApiServiceImpl();

    public static ApiApiService getApiApi() {
        return service;
    }
}
