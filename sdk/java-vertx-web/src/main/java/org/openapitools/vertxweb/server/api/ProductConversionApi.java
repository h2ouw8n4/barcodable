package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InlineResponse200;
import org.openapitools.vertxweb.server.model.InlineResponse400;

import org.openapitools.vertxweb.server.ApiResponse;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

public interface ProductConversionApi  {
    Single<ApiResponse<InlineResponse200>> convertCode(String upcEanAsin);
}
