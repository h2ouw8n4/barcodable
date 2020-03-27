namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductLookupApiHandlerParams
open ProductLookupApiServiceInterface
open ProductLookupApiServiceImplementation
open OpenAPI.Model.InvalidCode
open OpenAPI.Model.Item
open OpenAPI.Model.NotFound

module ProductLookupApiHandler = 

    /// <summary>
    /// 
    /// </summary>

    //#region GetItemByASIN
    /// <summary>
    /// Find item by asin code
    /// </summary>

    let GetItemByASIN (pathParams:GetItemByASINPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetItemByASINArgs
          let result = ProductLookupApiService.GetItemByASIN ctx serviceArgs
          return! (match result with 
                      | GetItemByASINDefaultStatusCode resolved ->
                            setStatusCode 200 >=> json resolved.content 
                      | GetItemByASINStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content 
                      | GetItemByASINStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content 
          ) next ctx
        }
    //#endregion

    //#region GetItemByEAN
    /// <summary>
    /// Find item by UPC code
    /// </summary>

    let GetItemByEAN (pathParams:GetItemByEANPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetItemByEANArgs
          let result = ProductLookupApiService.GetItemByEAN ctx serviceArgs
          return! (match result with 
                      | GetItemByEANDefaultStatusCode resolved ->
                            setStatusCode 200 >=> json resolved.content 
                      | GetItemByEANStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content 
                      | GetItemByEANStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content 
          ) next ctx
        }
    //#endregion

    //#region GetItemByUPC
    /// <summary>
    /// Find item by UPC code
    /// </summary>

    let GetItemByUPC (pathParams:GetItemByUPCPathParams) : HttpHandler = 
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetItemByUPCArgs
          let result = ProductLookupApiService.GetItemByUPC ctx serviceArgs
          return! (match result with 
                      | GetItemByUPCDefaultStatusCode resolved ->
                            setStatusCode 200 >=> json resolved.content 
                      | GetItemByUPCStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content 
                      | GetItemByUPCStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content 
          ) next ctx
        }
    //#endregion


    
