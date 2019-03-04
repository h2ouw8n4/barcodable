package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.InvalidCode;
import org.openapitools.client.model.Item;
import org.openapitools.client.model.NotFound;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ProductLookupApi extends OpenApi {
    /**
    * Constructor for the ProductLookupApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ProductLookupApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_item_by_asin: String = "get_item_by_asin";
        public static const event_get_item_by_ean: String = "get_item_by_ean";
        public static const event_get_item_by_upc: String = "get_item_by_upc";


    /*
     * Returns Item 
     */
    public function get_item_by_asin (asin: String): String {
        // create path and map variables
        var path: String = "/api/v1/asin/{asin}".replace(/{format}/g,"xml").replace("{" + "asin" + "}", getApiInvoker().escapeString(asin));

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
        token.completionEventType = "get_item_by_asin";

        token.returnType = Item;
        return requestId;

    }

    /*
     * Returns Item 
     */
    public function get_item_by_ean (ean: String): String {
        // create path and map variables
        var path: String = "/api/v1/ean/{ean}".replace(/{format}/g,"xml").replace("{" + "ean" + "}", getApiInvoker().escapeString(ean));

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
        token.completionEventType = "get_item_by_ean";

        token.returnType = Item;
        return requestId;

    }

    /*
     * Returns Item 
     */
    public function get_item_by_upc (upc: String): String {
        // create path and map variables
        var path: String = "/api/v1/upc/{upc}".replace(/{format}/g,"xml").replace("{" + "upc" + "}", getApiInvoker().escapeString(upc));

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
        token.completionEventType = "get_item_by_upc";

        token.returnType = Item;
        return requestId;

    }
}
}
