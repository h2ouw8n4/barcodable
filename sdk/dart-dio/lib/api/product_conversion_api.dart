import 'dart:async';
import 'dart:io';
import 'dart:convert';
import 'package:dio/dio.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/serializer.dart';

import 'package:openapi/model/inline_response400.dart';
import 'package:openapi/model/inline_response200.dart';

class ProductConversionApi {
    final Dio _dio;
    Serializers _serializers;

    ProductConversionApi(this._dio, this._serializers);

        /// Convert between UPC, EAN, and ASIN product codes.
        ///
        /// Returns the converted UPC, EAN, and ASIN codes.
        Future<Response<InlineResponse200>>convertCode(String upc | ean | asin,{ CancelToken cancelToken, Map<String, String> headers,}) async {

        String _path = "/api/v1/convert/{upc | ean | asin}".replaceAll("{" r'upc | ean | asin' "}", upc | ean | asin.toString());

        Map<String, dynamic> queryParams = {};
        Map<String, String> headerParams = Map.from(headers ?? {});
        dynamic bodyData;

        queryParams.removeWhere((key, value) => value == null);
        headerParams.removeWhere((key, value) => value == null);

        List<String> contentTypes = [];



            return _dio.request(
            _path,
            queryParameters: queryParams,
            data: bodyData,
            options: Options(
            method: 'get'.toUpperCase(),
            headers: headerParams,
            contentType: contentTypes.isNotEmpty ? contentTypes[0] : "application/json",
            ),
            cancelToken: cancelToken,
            ).then((response) {

        var serializer = _serializers.serializerForType(InlineResponse200);
        var data = _serializers.deserializeWith<InlineResponse200>(serializer, response.data);

            return Response<InlineResponse200>(
                data: data,
                headers: response.headers,
                request: response.request,
                redirects: response.redirects,
                statusCode: response.statusCode,
                statusMessage: response.statusMessage,
                extra: response.extra,
            );
            });
            }
        }
