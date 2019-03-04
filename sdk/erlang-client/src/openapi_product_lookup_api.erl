-module(openapi_product_lookup_api).

-export([get_item_by_asin/2, get_item_by_asin/3,
         get_item_by_ean/2, get_item_by_ean/3,
         get_item_by_upc/2, get_item_by_upc/3]).

-define(BASE_URL, "/magicCashew/barcodable/1.0.0").

%% @doc Find item by asin code
%% Returns a single item
-spec get_item_by_asin(ctx:ctx(), binary()) -> {ok, openapi_item:openapi_item(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_item_by_asin(Ctx, Asin) ->
    get_item_by_asin(Ctx, Asin, #{}).

-spec get_item_by_asin(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item:openapi_item(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_item_by_asin(Ctx, Asin, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/v1/asin/", Asin, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Find item by UPC code
%% Returns a single item
-spec get_item_by_ean(ctx:ctx(), binary()) -> {ok, openapi_item:openapi_item(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_item_by_ean(Ctx, Ean) ->
    get_item_by_ean(Ctx, Ean, #{}).

-spec get_item_by_ean(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item:openapi_item(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_item_by_ean(Ctx, Ean, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/v1/ean/", Ean, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Find item by UPC code
%% Returns a single item
-spec get_item_by_upc(ctx:ctx(), binary()) -> {ok, openapi_item:openapi_item(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_item_by_upc(Ctx, Upc) ->
    get_item_by_upc(Ctx, Upc, #{}).

-spec get_item_by_upc(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_item:openapi_item(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_item_by_upc(Ctx, Upc, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = ["/api/v1/upc/", Upc, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


