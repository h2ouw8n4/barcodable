package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InvalidCode;
import org.openapitools.vertxweb.server.model.Item;
import org.openapitools.vertxweb.server.model.NotFound;

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

public class ProductLookupApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProductLookupApiHandler.class);
    private ProductLookupApi apiImpl = new ProductLookupApiImpl();

    public ProductLookupApiHandler(Map<String, Handler<RoutingContext>> operationHandlers) {
        operationHandlers.put("getItemByASIN", this::getItemByASIN);
        operationHandlers.put("getItemByEAN", this::getItemByEAN);
        operationHandlers.put("getItemByUPC", this::getItemByUPC);
    }

    private void getItemByASIN(RoutingContext routingContext) {
        logger.info("getItemByASIN()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String asin = ParameterCast.toString(routingContext.pathParams().get("asin"));

            logger.info("Parameter asin is {}", asin);
            return apiImpl.getItemByASIN(asin);
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


    private void getItemByEAN(RoutingContext routingContext) {
        logger.info("getItemByEAN()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String ean = ParameterCast.toString(routingContext.pathParams().get("ean"));

            logger.info("Parameter ean is {}", ean);
            return apiImpl.getItemByEAN(ean);
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


    private void getItemByUPC(RoutingContext routingContext) {
        logger.info("getItemByUPC()");
        HttpServerResponse response = routingContext.response();

        Single.defer( () -> {
            String upc = ParameterCast.toString(routingContext.pathParams().get("upc"));

            logger.info("Parameter upc is {}", upc);
            return apiImpl.getItemByUPC(upc);
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
