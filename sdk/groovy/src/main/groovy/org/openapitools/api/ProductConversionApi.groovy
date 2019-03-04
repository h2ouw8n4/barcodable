package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse400

import java.util.*;

@Mixin(ApiUtils)
class ProductConversionApi {
    String basePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0"
    String versionPath = "/api/v1"

    def convertCode ( String upcEanAsin, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/api/v1/convert/{upc | ean | asin}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (upcEanAsin == null) {
            throw new RuntimeException("missing required params upcEanAsin")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InlineResponse200.class )

    }

}
