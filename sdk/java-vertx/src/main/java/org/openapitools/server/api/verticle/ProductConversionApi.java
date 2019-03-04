package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse400;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductConversionApi  {
    //convertCode
    void convertCode(String upcEanAsin, Handler<AsyncResult<InlineResponse200>> handler);
    
}
