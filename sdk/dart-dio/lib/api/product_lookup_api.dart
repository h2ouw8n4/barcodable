import 'dart:async';
import 'dart:io';
import 'dart:convert';
import 'package:dio/dio.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/serializer.dart';

import 'package:openapi/model/invalid_code.dart';
import 'package:openapi/model/item.dart';
import 'package:openapi/model/not_found.dart';

class ProductLookupApi {
    final Dio _dio;
    Serializers _serializers;

    ProductLookupApi(this._dio, this._serializers);

        /// Find item by asin code
        ///
        /// Returns a single item
        Future<Response<Item>>getItemByASIN(String asin,{ CancelToken cancelToken, Map<String, String> headers,}) async {

        String _path = "/api/v1/asin/{asin}".replaceAll("{" r'asin' "}", asin.toString());

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

        var serializer = _serializers.serializerForType(Item);
        var data = _serializers.deserializeWith<Item>(serializer, response.data);

            return Response<Item>(
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
        /// Find item by UPC code
        ///
        /// Returns a single item
        Future<Response<Item>>getItemByEAN(String ean,{ CancelToken cancelToken, Map<String, String> headers,}) async {

        String _path = "/api/v1/ean/{ean}".replaceAll("{" r'ean' "}", ean.toString());

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

        var serializer = _serializers.serializerForType(Item);
        var data = _serializers.deserializeWith<Item>(serializer, response.data);

            return Response<Item>(
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
        /// Find item by UPC code
        ///
        /// Returns a single item
        Future<Response<Item>>getItemByUPC(String upc,{ CancelToken cancelToken, Map<String, String> headers,}) async {

        String _path = "/api/v1/upc/{upc}".replaceAll("{" r'upc' "}", upc.toString());

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

        var serializer = _serializers.serializerForType(Item);
        var data = _serializers.deserializeWith<Item>(serializer, response.data);

            return Response<Item>(
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
