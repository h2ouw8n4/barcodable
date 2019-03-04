-module(openapi_product_conversion_api).

-export([convert_code/2, convert_code/3]).

-define(BASE_URL, "/mindviser/barcodable/1.0.0").

%% @doc Convert between UPC, EAN, and ASIN product codes.
%% Returns the converted UPC, EAN, and ASIN codes.
-spec convert_code(ctx:ctx(), binary()) -> {ok, openapi_inline_response_200:openapi_inline_response_200(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
convert_code(Ctx, UpcEanAsin) ->
    convert_code(Ctx, UpcEanAsin, #{}).

-spec convert_code(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_inline_response_200:openapi_inline_response_200(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
convert_code(Ctx, UpcEanAsin, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/v1/convert/", Upc | ean | asin, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


