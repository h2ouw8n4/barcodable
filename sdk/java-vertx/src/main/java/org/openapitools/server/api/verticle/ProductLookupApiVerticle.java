package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.InvalidCode;
import org.openapitools.server.api.model.Item;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NotFound;

import java.util.List;
import java.util.Map;

public class ProductLookupApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ProductLookupApiVerticle.class); 
    
    final static String GETITEMBYASIN_SERVICE_ID = "getItemByASIN";
    final static String GETITEMBYEAN_SERVICE_ID = "getItemByEAN";
    final static String GETITEMBYUPC_SERVICE_ID = "getItemByUPC";
    
    final ProductLookupApi service;

    public ProductLookupApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ProductLookupApiImpl");
            service = (ProductLookupApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductLookupApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getItemByASIN
        vertx.eventBus().<JsonObject> consumer(GETITEMBYASIN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getItemByASIN";
                String asinParam = message.body().getString("asin");
                if(asinParam == null) {
                    manageError(message, new MainApiException(400, "asin is required"), serviceId);
                    return;
                }
                String asin = asinParam;
                service.getItemByASIN(asin, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getItemByASIN");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getItemByASIN", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getItemByEAN
        vertx.eventBus().<JsonObject> consumer(GETITEMBYEAN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getItemByEAN";
                String eanParam = message.body().getString("ean");
                if(eanParam == null) {
                    manageError(message, new MainApiException(400, "ean is required"), serviceId);
                    return;
                }
                String ean = eanParam;
                service.getItemByEAN(ean, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getItemByEAN");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getItemByEAN", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getItemByUPC
        vertx.eventBus().<JsonObject> consumer(GETITEMBYUPC_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getItemByUPC";
                String upcParam = message.body().getString("upc");
                if(upcParam == null) {
                    manageError(message, new MainApiException(400, "upc is required"), serviceId);
                    return;
                }
                String upc = upcParam;
                service.getItemByUPC(upc, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getItemByUPC");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getItemByUPC", e);
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
