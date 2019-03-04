require 'json'


MyApp.add_route('GET', '/mindviser/barcodable/1.0.0/api/v1/convert/{upc | ean | asin}', {
  "resourcePath" => "/ProductConversion",
  "summary" => "Convert between UPC, EAN, and ASIN product codes.",
  "nickname" => "convert_code", 
  "responseClass" => "inline_response_200",
  "endpoint" => "/api/v1/convert/{upc | ean | asin}", 
  "notes" => "Returns the converted UPC, EAN, and ASIN codes.",
  "parameters" => [
    {
      "name" => "upc___ean___asin",
      "description" => "UPC, EAN, or ASIN",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

