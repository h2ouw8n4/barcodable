namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InlineResponse400 = 

  //#region InlineResponse400

  [<CLIMutable>]
  type InlineResponse400 = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : int;
  }
  
  //#endregion
  