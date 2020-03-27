namespace OpenAPI.Model

open System
open System.Collections.Generic

module NotFound = 

  //#region NotFound


  type not_found = {
    Message : string;
    Status : int;
  }
  //#endregion
  