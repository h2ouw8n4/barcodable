namespace OpenAPI

open ProductConversionApiHandlerParams
open ProductConversionApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ProductConversionApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ConvertCode
    /// <summary>
    /// Convert between UPC, EAN, and ASIN product codes.
    /// </summary>
   [<FunctionName("ConvertCode")>]
    let ConvertCode
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/magicCashew/barcodable/1.0.0/api/v1/convert/{upc | ean | asin}")>]
        req:HttpRequest ) =
      
      let result = ProductConversionApiService.ConvertCode ()
      match result with 
      | ConvertCodeDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | ConvertCodeStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 


      

