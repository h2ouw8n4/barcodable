package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.InvalidCode;
import org.openapitools.vertxweb.server.model.Item;
import org.openapitools.vertxweb.server.model.NotFound;

import org.openapitools.vertxweb.server.ApiResponse;

import io.reactivex.Single;

import java.util.List;
import java.util.Map;

public interface ProductLookupApi  {
    Single<ApiResponse<Item>> getItemByASIN(String asin);
    Single<ApiResponse<Item>> getItemByEAN(String ean);
    Single<ApiResponse<Item>> getItemByUPC(String upc);
}
