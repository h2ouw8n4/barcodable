namespace OpenAPI.Model

open System
open System.Collections.Generic

module Item = 

  //#region Item


  type item = {
    Upc : string;
    Ean : string;
    Isbn : string;
    Asin : string;
    Title : string;
    Sku : string;
    Mpn : string;
    PartNumber : string;
    Upcs : string[];
    Description : string;
    Brand : string;
    Manufacturer : string;
    Color : string;
    NewPrice : decimal;
    UsedPrice : decimal;
    CurrencyCode : string;
    Url : string;
    Features : string[];
    Dimensions : obj[];
    Images : string[];
    MatchedItems : obj[];
    IsoCountryCodes : string[];
    CompanyName : string;
    CompanyAddress : string;
    Categories : string[];
    CategoryHierarchies : string[];
  }
  //#endregion
  