package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.InvalidCode
import org.openapitools.model.Item
import org.openapitools.model.NotFound

class ProductLookupApi {
    String basePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getItemByASIN ( String asin, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/asin/${asin}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (asin == null) {
            throw new RuntimeException("missing required params asin")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Item.class )

    }

    def getItemByEAN ( String ean, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/ean/${ean}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ean == null) {
            throw new RuntimeException("missing required params ean")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Item.class )

    }

    def getItemByUPC ( String upc, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/upc/${upc}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (upc == null) {
            throw new RuntimeException("missing required params upc")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Item.class )

    }

}
