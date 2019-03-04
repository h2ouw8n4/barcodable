package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InlineResponse200;
import org.openapitools.server.api.model.InlineResponse400;
import org.openapitools.server.api.MainApiException;

public final class ProductConversionApiException extends MainApiException {
    public ProductConversionApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final ProductConversionApiException ProductConversion_convertCode_400_Exception = new ProductConversionApiException(400, "search results matching criteria");
    

}