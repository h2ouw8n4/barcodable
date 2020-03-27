import 'package:jaguar_retrofit/annotations/annotations.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_mimetype/jaguar_mimetype.dart';
import 'dart:async';

import 'package:openapi/model/inline_response400.dart';
import 'package:openapi/model/inline_response200.dart';

part 'product_conversion_api.jretro.dart';

@GenApiClient()
class ProductConversionApi extends ApiClient with _$ProductConversionApiClient {
    final Route base;
    final Map<String, CodecRepo> converters;
    final Duration timeout;

    ProductConversionApi({this.base, this.converters, this.timeout = const Duration(minutes: 2)});

    /// Convert between UPC, EAN, and ASIN product codes.
    ///
    /// Returns the converted UPC, EAN, and ASIN codes.
    @GetReq(path: "/api/v1/convert/:upc | ean | asin")
    Future<InlineResponse200> convertCode(
            @PathParam("upc | ean | asin") String upc | ean | asin
        ) {
        return super.convertCode(
        upc | ean | asin

        ).timeout(timeout);
    }


}
