namespace OpenAPI
open OpenAPI.Model.InvalidCode
open OpenAPI.Model.Item
open OpenAPI.Model.NotFound
open ProductLookupApiHandlerParams
open ProductLookupApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ProductLookupApiServiceImplementation =
    
    //#region Service implementation
    type ProductLookupApiServiceImpl() = 
      interface IProductLookupApiService with
      
        member this.GetItemByASIN ctx args =
          if true then 
            let content = "successful operation" :> obj :?> Item // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByASINDefaultStatusCode { content = content }
          else if true then 
            let content = "search results matching criteria" :> obj :?> InvalidCode // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByASINStatusCode400 { content = content }
          else
            let content = "search results matching criteria" :> obj :?> NotFound // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByASINStatusCode404 { content = content }

        member this.GetItemByEAN ctx args =
          if true then 
            let content = "successful operation" :> obj :?> Item // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByEANDefaultStatusCode { content = content }
          else if true then 
            let content = "search results matching criteria" :> obj :?> InvalidCode // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByEANStatusCode400 { content = content }
          else
            let content = "search results matching criteria" :> obj :?> NotFound // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByEANStatusCode404 { content = content }

        member this.GetItemByUPC ctx args =
          if true then 
            let content = "successful operation" :> obj :?> Item // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByUPCDefaultStatusCode { content = content }
          else if true then 
            let content = "search results matching criteria" :> obj :?> InvalidCode // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByUPCStatusCode400 { content = content }
          else
            let content = "search results matching criteria" :> obj :?> NotFound // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetItemByUPCStatusCode404 { content = content }

      //#endregion

    let ProductLookupApiService = ProductLookupApiServiceImpl() :> IProductLookupApiService