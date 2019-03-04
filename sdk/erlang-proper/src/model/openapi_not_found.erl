-module(openapi_not_found).

-include("openapi.hrl").

-export([openapi_not_found/0]).

-export([openapi_not_found/1]).

-export_type([openapi_not_found/0]).

-type openapi_not_found() ::
  [ {'message', binary() }
  | {'status', integer() }
  ].


openapi_not_found() ->
    openapi_not_found([]).

openapi_not_found(Fields) ->
  Default = [ {'message', binary() }
            , {'status', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

