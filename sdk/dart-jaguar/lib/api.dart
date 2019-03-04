library openapi.api;

import 'package:http/io_client.dart';
import 'package:jaguar_serializer/jaguar_serializer.dart';
import 'package:jaguar_retrofit/jaguar_retrofit.dart';
import 'package:openapi/auth/api_key_auth.dart';
import 'package:openapi/auth/basic_auth.dart';
import 'package:openapi/auth/oauth.dart';

import 'package:openapi/api/product_conversion_api.dart';
import 'package:openapi/api/product_lookup_api.dart';

import 'package:openapi/model/inline_response200.dart';
import 'package:openapi/model/inline_response400.dart';
import 'package:openapi/model/invalid_code.dart';
import 'package:openapi/model/item.dart';
import 'package:openapi/model/not_found.dart';


final jsonJaguarRepo = JsonRepo()
..add(InlineResponse200Serializer())
..add(InlineResponse400Serializer())
..add(InvalidCodeSerializer())
..add(ItemSerializer())
..add(NotFoundSerializer())
;

final _defaultInterceptors = [OAuthInterceptor(), BasicAuthInterceptor(), ApiKeyAuthInterceptor()];

class JaguarApiGen {
    List<Interceptor> interceptors;
    String basePath = "https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0";
    Route _baseRoute;
    final Duration timeout;

    /**
    * Add custom global interceptors, put overrideInterceptors to true to set your interceptors only (auth interceptors will not be added)
    */
    JaguarApiGen({List<Interceptor> interceptors, bool overrideInterceptors = false, String baseUrl, this.timeout = const Duration(minutes: 2)}) {
        _baseRoute = Route(baseUrl ?? basePath).withClient(globalClient ?? IOClient());
        if(interceptors == null) {
            this.interceptors = _defaultInterceptors;
        }
        else if(overrideInterceptors){
            this.interceptors = interceptors;
        }
        else {
            this.interceptors = List.from(_defaultInterceptors)..addAll(interceptors);
        }

        this.interceptors.forEach((interceptor) {
            _baseRoute.before(interceptor.before);
            _baseRoute.after(interceptor.after);
        });
    }

    void setOAuthToken(String name, String token) {
        (_defaultInterceptors[0] as OAuthInterceptor).tokens[name] = token;
    }

    void setBasicAuth(String name, String username, String password) {
        (_defaultInterceptors[1] as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }

    void setApiKey(String name, String apiKey) {
        (_defaultInterceptors[2] as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }

    
    /**
    * Get ProductConversionApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    ProductConversionApi getProductConversionApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return ProductConversionApi(base: base, serializers: serializers, timeout: timeout);
    }

    
    /**
    * Get ProductLookupApi instance, base route and serializer can be overridden by a given but be careful,
    * by doing that all interceptors will not be executed
    */
    ProductLookupApi getProductLookupApi({Route base, SerializerRepo serializers}) {
        if(base == null) {
            base = _baseRoute;
        }
        if(serializers == null) {
            serializers = jsonJaguarRepo;
        }
        return ProductLookupApi(base: base, serializers: serializers, timeout: timeout);
    }

    
}