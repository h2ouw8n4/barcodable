package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse400;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ProductConversionApi extends OpenApi {
    /**
    * Constructor for the ProductConversionApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ProductConversionApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_convert_code: String = "convert_code";


    /*
     * Returns InlineResponse200 
     */
    public function convert_code (upc | ean | asin: String): String {
        // create path and map variables
        var path: String = "/api/v1/convert/{upc | ean | asin}".replace(/{format}/g,"xml").replace("{" + "upc | ean | asin" + "}", getApiInvoker().escapeString(upc | ean | asin));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "convert_code";

        token.returnType = InlineResponse200;
        return requestId;

    }
}
}
