package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InvalidCode;
import org.openapitools.server.api.model.Item;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NotFound;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductLookupApi  {
    //getItemByASIN
    void getItemByASIN(String asin, Handler<AsyncResult<Item>> handler);
    
    //getItemByEAN
    void getItemByEAN(String ean, Handler<AsyncResult<Item>> handler);
    
    //getItemByUPC
    void getItemByUPC(String upc, Handler<AsyncResult<Item>> handler);
    
}
