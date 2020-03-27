package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.InlineResponse200
import org.openapitools.model.InlineResponse400

class ProductConversionApi {
    String basePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def convertCode ( String upcEanAsin, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/convert/${upc | ean | asin}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (upcEanAsin == null) {
            throw new RuntimeException("missing required params upcEanAsin")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    InlineResponse200.class )

    }

}
