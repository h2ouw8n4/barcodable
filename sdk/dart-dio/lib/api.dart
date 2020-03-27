library openapi.api;

import 'package:dio/dio.dart';
import 'package:built_value/serializer.dart';
import 'package:openapi/serializers.dart';
import 'package:openapi/api/product_conversion_api.dart';
import 'package:openapi/api/product_lookup_api.dart';


class Openapi {

    Dio dio;
    Serializers serializers;
    String basePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";

    Openapi({this.dio, Serializers serializers}) {
    if (dio == null) {
        BaseOptions options = new BaseOptions(
            baseUrl: basePath,
            connectTimeout: 5000,
            receiveTimeout: 3000,
        );
        this.dio = new Dio(options);
    }

    this.serializers = serializers ?? standardSerializers;
}


    /**
    * Get ProductConversionApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    ProductConversionApi getProductConversionApi() {
    return ProductConversionApi(dio, serializers);
    }


    /**
    * Get ProductLookupApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    ProductLookupApi getProductLookupApi() {
    return ProductLookupApi(dio, serializers);
    }


}