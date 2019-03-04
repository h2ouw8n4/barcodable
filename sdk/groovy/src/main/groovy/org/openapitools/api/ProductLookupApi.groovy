package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.InvalidCode
import org.openapitools.model.Item
import org.openapitools.model.NotFound

import java.util.*;

@Mixin(ApiUtils)
class ProductLookupApi {
    String basePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0"
    String versionPath = "/api/v1"

    def getItemByASIN ( String asin, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/api/v1/asin/{asin}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (asin == null) {
            throw new RuntimeException("missing required params asin")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Item.class )

    }

    def getItemByEAN ( String ean, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/api/v1/ean/{ean}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (ean == null) {
            throw new RuntimeException("missing required params ean")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Item.class )

    }

    def getItemByUPC ( String upc, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/api/v1/upc/{upc}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (upc == null) {
            throw new RuntimeException("missing required params upc")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Item.class )

    }

}
