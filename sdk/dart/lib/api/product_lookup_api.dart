part of openapi.api;



class ProductLookupApi {
  final ApiClient apiClient;

  ProductLookupApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Find item by asin code
  ///
  /// Returns a single item
  Future<Item> getItemByASIN(String asin) async {
    Object postBody;

    // verify required params are set
    if(asin == null) {
     throw new ApiException(400, "Missing required param: asin");
    }

    // create path and map variables
    String path = "/api/v1/asin/{asin}".replaceAll("{format}","json").replaceAll("{" + "asin" + "}", asin.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
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

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Item') as Item;
    } else {
      return null;
    }
  }
  /// Find item by UPC code
  ///
  /// Returns a single item
  Future<Item> getItemByEAN(String ean) async {
    Object postBody;

    // verify required params are set
    if(ean == null) {
     throw new ApiException(400, "Missing required param: ean");
    }

    // create path and map variables
    String path = "/api/v1/ean/{ean}".replaceAll("{format}","json").replaceAll("{" + "ean" + "}", ean.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
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

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Item') as Item;
    } else {
      return null;
    }
  }
  /// Find item by UPC code
  ///
  /// Returns a single item
  Future<Item> getItemByUPC(String upc) async {
    Object postBody;

    // verify required params are set
    if(upc == null) {
     throw new ApiException(400, "Missing required param: upc");
    }

    // create path and map variables
    String path = "/api/v1/upc/{upc}".replaceAll("{format}","json").replaceAll("{" + "upc" + "}", upc.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};

    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
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

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, _decodeBodyBytes(response));
    } else if(response.body != null) {
      return apiClient.deserialize(_decodeBodyBytes(response), 'Item') as Item;
    } else {
      return null;
    }
  }
}
