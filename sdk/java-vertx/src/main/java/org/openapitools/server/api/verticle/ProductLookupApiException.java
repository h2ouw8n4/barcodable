package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InvalidCode;
import org.openapitools.server.api.model.Item;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NotFound;

public final class ProductLookupApiException extends MainApiException {
    public ProductLookupApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final ProductLookupApiException ProductLookup_getItemByASIN_400_Exception = new ProductLookupApiException(400, "search results matching criteria");
    public static final ProductLookupApiException ProductLookup_getItemByASIN_404_Exception = new ProductLookupApiException(404, "search results matching criteria");
    public static final ProductLookupApiException ProductLookup_getItemByEAN_400_Exception = new ProductLookupApiException(400, "search results matching criteria");
    public static final ProductLookupApiException ProductLookup_getItemByEAN_404_Exception = new ProductLookupApiException(404, "search results matching criteria");
    public static final ProductLookupApiException ProductLookup_getItemByUPC_400_Exception = new ProductLookupApiException(400, "search results matching criteria");
    public static final ProductLookupApiException ProductLookup_getItemByUPC_404_Exception = new ProductLookupApiException(404, "search results matching criteria");
    

}