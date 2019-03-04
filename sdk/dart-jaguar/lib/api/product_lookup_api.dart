import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_serializer/src/repo/repo.dart';
import 'dart:async';

import 'package:openapi/model/invalid_code.dart';
import 'package:openapi/model/item.dart';
import 'package:openapi/model/not_found.dart';


part 'product_lookup_api.jretro.dart';

@GenApiClient()
class ProductLookupApi extends _$ProductLookupApiClient implements ApiClient {
    final Route base;
    final SerializerRepo serializers;
    final Duration timeout;

    ProductLookupApi({this.base, this.serializers, this.timeout = const Duration(minutes: 2)});

    /// Find item by asin code
    ///
    /// Returns a single item
    @GetReq(path: "/api/v1/asin/:asin")
    Future<Item> getItemByASIN(
            @PathParam("asin") String asin
        ) {
        return super.getItemByASIN(
        asin

        ).timeout(timeout);
    }

    /// Find item by UPC code
    ///
    /// Returns a single item
    @GetReq(path: "/api/v1/ean/:ean")
    Future<Item> getItemByEAN(
            @PathParam("ean") String ean
        ) {
        return super.getItemByEAN(
        ean

        ).timeout(timeout);
    }

    /// Find item by UPC code
    ///
    /// Returns a single item
    @GetReq(path: "/api/v1/upc/:upc")
    Future<Item> getItemByUPC(
            @PathParam("upc") String upc
        ) {
        return super.getItemByUPC(
        upc

        ).timeout(timeout);
    }


}
