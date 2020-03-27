namespace OpenAPI
open ProductConversionApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProductConversionApiServiceInterface =
    
    //#region Service interface
    type IProductConversionApiService = 
      abstract member ConvertCode : unit -> ConvertCodeResult
    //#endregion