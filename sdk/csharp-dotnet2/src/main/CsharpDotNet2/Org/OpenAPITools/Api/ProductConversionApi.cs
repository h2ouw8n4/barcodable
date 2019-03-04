using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProductConversionApi
    {
        /// <summary>
        /// Convert between UPC, EAN, and ASIN product codes. Returns the converted UPC, EAN, and ASIN codes.
        /// </summary>
        /// <param name="upcEanAsin">UPC, EAN, or ASIN</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 ConvertCode (string upcEanAsin);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ProductConversionApi : IProductConversionApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductConversionApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ProductConversionApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductConversionApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProductConversionApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        /// <summary>
        /// Convert between UPC, EAN, and ASIN product codes. Returns the converted UPC, EAN, and ASIN codes.
        /// </summary>
        /// <param name="upcEanAsin">UPC, EAN, or ASIN</param> 
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 ConvertCode (string upcEanAsin)
        {
            
            // verify the required parameter 'upcEanAsin' is set
            if (upcEanAsin == null) throw new ApiException(400, "Missing required parameter 'upcEanAsin' when calling ConvertCode");
            
    
            var path = "/api/v1/convert/{upc | ean | asin}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "upc | ean | asin" + "}", ApiClient.ParameterToString(upcEanAsin));
    
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;
    
                                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ConvertCode: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ConvertCode: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response.Content, typeof(InlineResponse200), response.Headers);
        }
    
    }
}
