namespace OpenAPI

open ProductLookupApiHandlerParams
open ProductLookupApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ProductLookupApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetItemByASIN
    /// <summary>
    /// Find item by asin code
    /// </summary>
   [<FunctionName("GetItemByASIN")>]
    let GetItemByASIN
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/magicCashew/barcodable/1.0.0/api/v1/asin/{asin}")>]
        req:HttpRequest ) =
      
      let result = ProductLookupApiService.GetItemByASIN ()
      match result with 
      | GetItemByASINDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetItemByASINStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 
      | GetItemByASINStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404)) 

    //#region GetItemByEAN
    /// <summary>
    /// Find item by UPC code
    /// </summary>
   [<FunctionName("GetItemByEAN")>]
    let GetItemByEAN
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/magicCashew/barcodable/1.0.0/api/v1/ean/{ean}")>]
        req:HttpRequest ) =
      
      let result = ProductLookupApiService.GetItemByEAN ()
      match result with 
      | GetItemByEANDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetItemByEANStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 
      | GetItemByEANStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404)) 

    //#region GetItemByUPC
    /// <summary>
    /// Find item by UPC code
    /// </summary>
   [<FunctionName("GetItemByUPC")>]
    let GetItemByUPC
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/magicCashew/barcodable/1.0.0/api/v1/upc/{upc}")>]
        req:HttpRequest ) =
      
      let result = ProductLookupApiService.GetItemByUPC ()
      match result with 
      | GetItemByUPCDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200)) 
      | GetItemByUPCStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400)) 
      | GetItemByUPCStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404)) 


      

