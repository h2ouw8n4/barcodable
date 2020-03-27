namespace OpenAPI

open OpenAPI.Model.InvalidCode
open OpenAPI.Model.Item
open OpenAPI.Model.NotFound
open System.Collections.Generic
open System

module ProductLookupApiHandlerParams = 

    //#region Path parameters
    [<CLIMutable>]
    type GetItemByASINPathParams = {
      asin : string ;
    }
    //#endregion

    
    type GetItemByASINDefaultStatusCodeResponse = {
      content:Item;
      
    }
    
    type GetItemByASINStatusCode400Response = {
      content:InvalidCode;
      
    }
    
    type GetItemByASINStatusCode404Response = {
      content:NotFound;
      
    }
    type GetItemByASINResult = GetItemByASINDefaultStatusCode of GetItemByASINDefaultStatusCodeResponse|GetItemByASINStatusCode400 of GetItemByASINStatusCode400Response|GetItemByASINStatusCode404 of GetItemByASINStatusCode404Response

    type GetItemByASINArgs = {
      pathParams:GetItemByASINPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetItemByEANPathParams = {
      ean : string ;
    }
    //#endregion

    
    type GetItemByEANDefaultStatusCodeResponse = {
      content:Item;
      
    }
    
    type GetItemByEANStatusCode400Response = {
      content:InvalidCode;
      
    }
    
    type GetItemByEANStatusCode404Response = {
      content:NotFound;
      
    }
    type GetItemByEANResult = GetItemByEANDefaultStatusCode of GetItemByEANDefaultStatusCodeResponse|GetItemByEANStatusCode400 of GetItemByEANStatusCode400Response|GetItemByEANStatusCode404 of GetItemByEANStatusCode404Response

    type GetItemByEANArgs = {
      pathParams:GetItemByEANPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetItemByUPCPathParams = {
      upc : string ;
    }
    //#endregion

    
    type GetItemByUPCDefaultStatusCodeResponse = {
      content:Item;
      
    }
    
    type GetItemByUPCStatusCode400Response = {
      content:InvalidCode;
      
    }
    
    type GetItemByUPCStatusCode404Response = {
      content:NotFound;
      
    }
    type GetItemByUPCResult = GetItemByUPCDefaultStatusCode of GetItemByUPCDefaultStatusCodeResponse|GetItemByUPCStatusCode400 of GetItemByUPCStatusCode400Response|GetItemByUPCStatusCode404 of GetItemByUPCStatusCode404Response

    type GetItemByUPCArgs = {
      pathParams:GetItemByUPCPathParams;
    }
    