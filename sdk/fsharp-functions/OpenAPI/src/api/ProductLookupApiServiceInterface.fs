namespace OpenAPI
open ProductLookupApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProductLookupApiServiceInterface =
    
    //#region Service interface
    type IProductLookupApiService = 
      abstract member GetItemByASIN : unit -> GetItemByASINResult
      abstract member GetItemByEAN : unit -> GetItemByEANResult
      abstract member GetItemByUPC : unit -> GetItemByUPCResult
    //#endregion