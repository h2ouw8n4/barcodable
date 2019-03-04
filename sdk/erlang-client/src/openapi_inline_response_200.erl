-module(openapi_inline_response_200).

-export([encode/1]).

-export_type([openapi_inline_response_200/0]).

-type openapi_inline_response_200() ::
    #{ 'upcs' => list(),
       'eans' => list(),
       'asins' => list(),
       'message' => binary()
     }.

encode(#{ 'upcs' := Upcs,
          'eans' := Eans,
          'asins' := Asins,
          'message' := Message
        }) ->
    #{ 'upcs' => Upcs,
       'eans' => Eans,
       'asins' => Asins,
       'message' => Message
     }.
