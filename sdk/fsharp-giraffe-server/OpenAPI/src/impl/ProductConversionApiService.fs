namespace OpenAPI
open OpenAPI.Model.InlineResponse200
open OpenAPI.Model.InlineResponse400
open ProductConversionApiHandlerParams
open ProductConversionApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ProductConversionApiServiceImplementation =
    
    //#region Service implementation
    type ProductConversionApiServiceImpl() = 
      interface IProductConversionApiService with
      
        member this.ConvertCode ctx args =
          if true then 
            let content = "successful operation" :> obj :?> InlineResponse200 // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConvertCodeDefaultStatusCode { content = content }
          else
            let content = "search results matching criteria" :> obj :?> InlineResponse400 // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConvertCodeStatusCode400 { content = content }

      //#endregion

    let ProductConversionApiService = ProductConversionApiServiceImpl() :> IProductConversionApiService