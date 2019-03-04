-module(openapi_inline_response_400).

-export([encode/1]).

-export_type([openapi_inline_response_400/0]).

-type openapi_inline_response_400() ::
    #{ 'message' => binary(),
       'status' => integer()
     }.

encode(#{ 'message' := Message,
          'status' := Status
        }) ->
    #{ 'message' => Message,
       'status' => Status
     }.
