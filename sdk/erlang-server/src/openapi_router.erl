-module(openapi_router).

-export([get_paths/1]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorState :: jesse_state:state()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'ConvertCode' => #{
            path => "/magicCashew/barcodable/1.0.0/api/v1/convert/:upc | ean | asin",
            method => <<"GET">>,
            handler => 'openapi_product_conversion_handler'
        },
        'GetItemByASIN' => #{
            path => "/magicCashew/barcodable/1.0.0/api/v1/asin/:asin",
            method => <<"GET">>,
            handler => 'openapi_product_lookup_handler'
        },
        'GetItemByEAN' => #{
            path => "/magicCashew/barcodable/1.0.0/api/v1/ean/:ean",
            method => <<"GET">>,
            handler => 'openapi_product_lookup_handler'
        },
        'GetItemByUPC' => #{
            path => "/magicCashew/barcodable/1.0.0/api/v1/upc/:upc",
            method => <<"GET">>,
            handler => 'openapi_product_lookup_handler'
        }
    }.

prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]).


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").


