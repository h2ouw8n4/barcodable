require 'json'


MyApp.add_route('GET', '/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}', {
  "resourcePath" => "/ProductLookup",
  "summary" => "Find item by asin code",
  "nickname" => "get_item_by_asin", 
  "responseClass" => "item",
  "endpoint" => "/api/v1/asin/{asin}", 
  "notes" => "Returns a single item",
  "parameters" => [
    {
      "name" => "asin",
      "description" => "ASIN code of item to return",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}', {
  "resourcePath" => "/ProductLookup",
  "summary" => "Find item by UPC code",
  "nickname" => "get_item_by_ean", 
  "responseClass" => "item",
  "endpoint" => "/api/v1/ean/{ean}", 
  "notes" => "Returns a single item",
  "parameters" => [
    {
      "name" => "ean",
      "description" => "EAN code of item to return",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}', {
  "resourcePath" => "/ProductLookup",
  "summary" => "Find item by UPC code",
  "nickname" => "get_item_by_upc", 
  "responseClass" => "item",
  "endpoint" => "/api/v1/upc/{upc}", 
  "notes" => "Returns a single item",
  "parameters" => [
    {
      "name" => "upc",
      "description" => "UPC code of item to return",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

