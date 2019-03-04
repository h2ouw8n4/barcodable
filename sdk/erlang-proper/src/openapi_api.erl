-module(openapi_api).

-export([ get_item_by_asin/1
        , get_item_by_ean/1
        , get_item_by_upc/1
        ]).

-define(BASE_URL, "/mindviser/barcodable/1.0.0").

%% @doc Find item by asin code
%% Returns a single item
-spec get_item_by_asin(binary()) ->
  openapi_utils:response().
get_item_by_asin(Asin) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v1/asin/", Asin, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Find item by UPC code
%% Returns a single item
-spec get_item_by_ean(binary()) ->
  openapi_utils:response().
get_item_by_ean(Ean) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v1/ean/", Ean, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Find item by UPC code
%% Returns a single item
-spec get_item_by_upc(binary()) ->
  openapi_utils:response().
get_item_by_upc(Upc) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/v1/upc/", Upc, ""],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

