namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InvalidCode = 

  //#region InvalidCode

  [<CLIMutable>]
  type InvalidCode = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : int;
  }
  
  //#endregion
  