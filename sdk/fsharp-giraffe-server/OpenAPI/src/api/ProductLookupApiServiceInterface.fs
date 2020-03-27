namespace OpenAPI
open ProductLookupApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProductLookupApiServiceInterface =
    
    //#region Service interface
    type IProductLookupApiService = 
      abstract member GetItemByASIN:HttpContext -> GetItemByASINArgs->GetItemByASINResult
      abstract member GetItemByEAN:HttpContext -> GetItemByEANArgs->GetItemByEANResult
      abstract member GetItemByUPC:HttpContext -> GetItemByUPCArgs->GetItemByUPCResult
    //#endregion