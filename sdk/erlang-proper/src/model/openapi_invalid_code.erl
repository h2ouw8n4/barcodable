-module(openapi_invalid_code).

-include("openapi.hrl").

-export([openapi_invalid_code/0]).

-export([openapi_invalid_code/1]).

-export_type([openapi_invalid_code/0]).

-type openapi_invalid_code() ::
  [ {'message', binary() }
  | {'status', integer() }
  ].


openapi_invalid_code() ->
    openapi_invalid_code([]).

openapi_invalid_code(Fields) ->
  Default = [ {'message', binary() }
            , {'status', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

