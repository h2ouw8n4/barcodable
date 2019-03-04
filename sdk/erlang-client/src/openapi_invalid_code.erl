-module(openapi_invalid_code).

-export([encode/1]).

-export_type([openapi_invalid_code/0]).

-type openapi_invalid_code() ::
    #{ 'message' => binary(),
       'status' => integer()
     }.

encode(#{ 'message' := Message,
          'status' := Status
        }) ->
    #{ 'message' => Message,
       'status' => Status
     }.
