-module(openapi_inline_response_400).

-include("openapi.hrl").

-export([openapi_inline_response_400/0]).

-export([openapi_inline_response_400/1]).

-export_type([openapi_inline_response_400/0]).

-type openapi_inline_response_400() ::
  [ {'message', binary() }
  | {'status', integer() }
  ].


openapi_inline_response_400() ->
    openapi_inline_response_400([]).

openapi_inline_response_400(Fields) ->
  Default = [ {'message', binary() }
            , {'status', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

