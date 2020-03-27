namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductConversionApiHandlerParams
open ProductConversionApiServiceInterface
open ProductConversionApiServiceImplementation
open OpenAPI.Model.InlineResponse200
open OpenAPI.Model.InlineResponse400

module ProductConversionApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region ConvertCode
    /// <summary>
    /// Convert between UPC, EAN, and ASIN product codes.
    /// </summary>

    let ConvertCode (pathParams:ConvertCodePathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ConvertCodeArgs
          let result = ProductConversionApiService.ConvertCode ctx serviceArgs
          return! (match result with 
                      | ConvertCodeDefaultStatusCode resolved ->
                            setStatusCode 200 >=> json resolved.content 
                      | ConvertCodeStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content 
          ) next ctx
        }
    //#endregion


    
