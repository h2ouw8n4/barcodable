namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Item = 

  //#region Item

  [<CLIMutable>]
  type Item = {
    [<JsonProperty(PropertyName = "upc")>]
    Upc : string;
    [<JsonProperty(PropertyName = "ean")>]
    Ean : string;
    [<JsonProperty(PropertyName = "isbn")>]
    Isbn : string;
    [<JsonProperty(PropertyName = "asin")>]
    Asin : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "sku")>]
    Sku : string;
    [<JsonProperty(PropertyName = "mpn")>]
    Mpn : string;
    [<JsonProperty(PropertyName = "part_number")>]
    PartNumber : string;
    [<JsonProperty(PropertyName = "upcs")>]
    Upcs : string[];
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string;
    [<JsonProperty(PropertyName = "manufacturer")>]
    Manufacturer : string;
    [<JsonProperty(PropertyName = "color")>]
    Color : string;
    [<JsonProperty(PropertyName = "new_price")>]
    NewPrice : decimal;
    [<JsonProperty(PropertyName = "used_price")>]
    UsedPrice : decimal;
    [<JsonProperty(PropertyName = "currency_code")>]
    CurrencyCode : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "features")>]
    Features : string[];
    [<JsonProperty(PropertyName = "dimensions")>]
    Dimensions : obj[];
    [<JsonProperty(PropertyName = "images")>]
    Images : string[];
    [<JsonProperty(PropertyName = "matched_items")>]
    MatchedItems : obj[];
    [<JsonProperty(PropertyName = "iso_country_codes")>]
    IsoCountryCodes : string[];
    [<JsonProperty(PropertyName = "company_name")>]
    CompanyName : string;
    [<JsonProperty(PropertyName = "company_address")>]
    CompanyAddress : string;
    [<JsonProperty(PropertyName = "categories")>]
    Categories : string[];
    [<JsonProperty(PropertyName = "category_hierarchies")>]
    CategoryHierarchies : string[];
  }
  
  //#endregion
  