-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% get_item_by_asin
%%==============================================================================

get_item_by_asin(Asin) ->
  openapi_api:get_item_by_asin(Asin).

get_item_by_asin_args(_S) ->
  [binary()].

%%==============================================================================
%% get_item_by_ean
%%==============================================================================

get_item_by_ean(Ean) ->
  openapi_api:get_item_by_ean(Ean).

get_item_by_ean_args(_S) ->
  [binary()].

%%==============================================================================
%% get_item_by_upc
%%==============================================================================

get_item_by_upc(Upc) ->
  openapi_api:get_item_by_upc(Upc).

get_item_by_upc_args(_S) ->
  [binary()].

