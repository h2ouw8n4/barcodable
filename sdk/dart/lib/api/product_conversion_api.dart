part of openapi.api;



class ProductConversionApi {
  final ApiClient apiClient;

  ProductConversionApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Convert between UPC, EAN, and ASIN product codes. with HTTP info returned
  ///
  /// Returns the converted UPC, EAN, and ASIN codes.
  Future<Response> convertCodeWithHttpInfo(String upc | ean | asin) async {
    Object postBody;

    // verify required params are set
    if(upc | ean | asin == null) {
     throw ApiException(400, "Missing required param: upc | ean | asin");
    }

    // create path and map variables
    String path = "/api/v1/convert/{upc | ean | asin}".replaceAll("{format}","json").replaceAll("{" + "upc | ean | asin" + "}", upc | ean | asin.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = [];

    String contentType = contentTypes.isNotEmpty ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
    }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);
    return response;
  }

  /// Convert between UPC, EAN, and ASIN product codes.
  ///
  /// Returns the converted UPC, EAN, and ASIN codes.
  Future<InlineResponse200> convertCode(String upc | ean | asin) async {
    Response response = await convertCodeWithHttpInfo(upc | ean | asin);
    if(response.statusCode >= 400) {
      throw ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'InlineResponse200') as InlineResponse200;
    } else {
      return null;
    }
  }

}
