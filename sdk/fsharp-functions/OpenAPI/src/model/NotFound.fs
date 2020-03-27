namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NotFound = 

  //#region NotFound

  [<CLIMutable>]
  type NotFound = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : int;
  }
  
  //#endregion
  