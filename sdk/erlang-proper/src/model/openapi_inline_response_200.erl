-module(openapi_inline_response_200).

-include("openapi.hrl").

-export([openapi_inline_response_200/0]).

-export([openapi_inline_response_200/1]).

-export_type([openapi_inline_response_200/0]).

-type openapi_inline_response_200() ::
  [ {'upcs', list(binary()) }
  | {'eans', list(binary()) }
  | {'asins', list(binary()) }
  | {'message', binary() }
  ].


openapi_inline_response_200() ->
    openapi_inline_response_200([]).

openapi_inline_response_200(Fields) ->
  Default = [ {'upcs', list(binary()) }
            , {'eans', list(binary()) }
            , {'asins', list(binary()) }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

