-module(openapi_item).

-include("openapi.hrl").

-export([openapi_item/0]).

-export([openapi_item/1]).

-export_type([openapi_item/0]).

-type openapi_item() ::
  [ {'upc', binary() }
  | {'ean', binary() }
  | {'isbn', binary() }
  | {'asin', binary() }
  | {'title', binary() }
  | {'sku', binary() }
  | {'mpn', binary() }
  | {'part_number', binary() }
  | {'upcs', list(binary()) }
  | {'description', binary() }
  | {'brand', binary() }
  | {'manufacturer', binary() }
  | {'color', binary() }
  | {'new_price', integer() }
  | {'used_price', integer() }
  | {'currency_code', binary() }
  | {'url', binary() }
  | {'features', list(binary()) }
  | {'dimensions', list(map()) }
  | {'images', list(binary()) }
  | {'matched_items', list(map()) }
  | {'iso_country_codes', list(binary()) }
  | {'company_name', binary() }
  | {'company_address', binary() }
  | {'categories', list(binary()) }
  | {'category_hierarchies', list(binary()) }
  ].


openapi_item() ->
    openapi_item([]).

openapi_item(Fields) ->
  Default = [ {'upc', binary() }
            , {'ean', binary() }
            , {'isbn', binary() }
            , {'asin', binary() }
            , {'title', binary() }
            , {'sku', binary() }
            , {'mpn', binary() }
            , {'part_number', binary() }
            , {'upcs', list(binary()) }
            , {'description', binary() }
            , {'brand', binary() }
            , {'manufacturer', binary() }
            , {'color', binary() }
            , {'new_price', integer() }
            , {'used_price', integer() }
            , {'currency_code', binary() }
            , {'url', binary() }
            , {'features', list(binary()) }
            , {'dimensions', list(map()) }
            , {'images', list(binary()) }
            , {'matched_items', list(map()) }
            , {'iso_country_codes', list(binary()) }
            , {'company_name', binary() }
            , {'company_address', binary() }
            , {'categories', list(binary()) }
            , {'category_hierarchies', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

