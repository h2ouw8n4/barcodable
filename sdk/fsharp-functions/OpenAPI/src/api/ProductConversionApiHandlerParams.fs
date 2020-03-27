namespace OpenAPI

open OpenAPI.Model.InlineResponse200
open OpenAPI.Model.InlineResponse400
open System.Collections.Generic
open System

module ProductConversionApiHandlerParams = 

    //#region Path parameters
    [<CLIMutable>]
    type ConvertCodePathParams = {
      upcEanAsin : string ;
    }
    //#endregion

    
    type ConvertCodeDefaultStatusCodeResponse = {
      content:InlineResponse200;
      
    }
    
    type ConvertCodeStatusCode400Response = {
      content:InlineResponse400;
      
    }
    type ConvertCodeResult = ConvertCodeDefaultStatusCode of ConvertCodeDefaultStatusCodeResponse|ConvertCodeStatusCode400 of ConvertCodeStatusCode400Response

    type ConvertCodeArgs = {
      pathParams:ConvertCodePathParams;
    }
    