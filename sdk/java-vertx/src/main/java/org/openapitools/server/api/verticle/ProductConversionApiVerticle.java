package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse400;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ProductConversionApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ProductConversionApiVerticle.class); 
    
    final static String CONVERTCODE_SERVICE_ID = "convertCode";
    
    final ProductConversionApi service;

    public ProductConversionApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ProductConversionApiImpl");
            service = (ProductConversionApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductConversionApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for convertCode
        vertx.eventBus().<JsonObject> consumer(CONVERTCODE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "convertCode";
                String upcEanAsinParam = message.body().getString("upc | ean | asin");
                if(upcEanAsinParam == null) {
                    manageError(message, new MainApiException(400, "upc | ean | asin is required"), serviceId);
                    return;
                }
                String upcEanAsin = upcEanAsinParam;
                service.convertCode(upcEanAsin, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "convertCode");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("convertCode", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
