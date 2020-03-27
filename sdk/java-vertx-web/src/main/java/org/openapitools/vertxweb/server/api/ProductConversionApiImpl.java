package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InlineResponse200;
import org.openapitools.vertxweb.server.model.InlineResponse400;

import org.openapitools.vertxweb.server.ApiResponse;
import org.openapitools.vertxweb.server.ApiException;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProductConversionApiImpl implements ProductConversionApi {
    public Single<ApiResponse<InlineResponse200>> convertCode(String upcEanAsin) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

}
