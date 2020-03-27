namespace OpenAPI
open ProductConversionApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProductConversionApiServiceInterface =
    
    //#region Service interface
    type IProductConversionApiService = 
      abstract member ConvertCode:HttpContext -> ConvertCodeArgs->ConvertCodeResult
    //#endregion