package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InlineResponse200;
import org.openapitools.vertxweb.server.model.InlineResponse400;

import org.openapitools.vertxweb.server.ParameterCast;
import org.openapitools.vertxweb.server.ApiException;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.Json;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

public class ProductConversionApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProductConversionApiHandler.class);
    private ProductConversionApi apiImpl = new ProductConversionApiImpl();

    public ProductConversionApiHandler(Map<String, Handler<RoutingContext>> operationHandlers) {
        operationHandlers.put("convertCode", this::convertCode);
    }

    private void convertCode(RoutingContext routingContext) {
        logger.info("convertCode()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String upcEanAsin = ParameterCast.toString(routingContext.pathParams().get("upc | ean | asin"));

            logger.info("Parameter upcEanAsin is {}", upcEanAsin);
            return apiImpl.convertCode(upcEanAsin);
        })
        .subscribe(
            apiResponse -> {
                response.setStatusCode(apiResponse.getStatusCode())
                        .end(Json.encodePrettily(apiResponse.getData()));
            }, error -> {
                if (error instanceof ApiException) {
                    ApiException apiException = (ApiException) error;
                    response.setStatusCode(apiException.getStatusCode()).end(apiException.getMessage());
                } else {
                    response.setStatusCode(500).end(error.getMessage());
                }
            }).dispose();
    }

}
