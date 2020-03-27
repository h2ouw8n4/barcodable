package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InvalidCode;
import org.openapitools.vertxweb.server.model.Item;
import org.openapitools.vertxweb.server.model.NotFound;

import org.openapitools.vertxweb.server.ApiResponse;
import org.openapitools.vertxweb.server.ApiException;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProductLookupApiImpl implements ProductLookupApi {
    public Single<ApiResponse<Item>> getItemByASIN(String asin) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

    public Single<ApiResponse<Item>> getItemByEAN(String ean) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

    public Single<ApiResponse<Item>> getItemByUPC(String upc) {
        return Single.error(new ApiException("Not Implemented").setStatusCode(501));
    }

}
