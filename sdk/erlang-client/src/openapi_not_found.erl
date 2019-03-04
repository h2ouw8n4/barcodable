-module(openapi_not_found).

-export([encode/1]).

-export_type([openapi_not_found/0]).

-type openapi_not_found() ::
    #{ 'message' => binary(),
       'status' => integer()
     }.

encode(#{ 'message' := Message,
          'status' := Status
        }) ->
    #{ 'message' => Message,
       'status' => Status
     }.
