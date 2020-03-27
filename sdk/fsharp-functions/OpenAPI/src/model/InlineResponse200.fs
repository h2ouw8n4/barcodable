namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InlineResponse200 = 

  //#region InlineResponse200

  [<CLIMutable>]
  type InlineResponse200 = {
    [<JsonProperty(PropertyName = "upcs")>]
    Upcs : string[];
    [<JsonProperty(PropertyName = "eans")>]
    Eans : string[];
    [<JsonProperty(PropertyName = "asins")>]
    Asins : string[];
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }
  
  //#endregion
  