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
    public interface IProductLookupApi
    {
        /// <summary>
        /// Find item by asin code Returns a single item
        /// </summary>
        /// <param name="asin">ASIN code of item to return</param>
        /// <returns>Item</returns>
        Item GetItemByASIN (string asin);
        /// <summary>
        /// Find item by UPC code Returns a single item
        /// </summary>
        /// <param name="ean">EAN code of item to return</param>
        /// <returns>Item</returns>
        Item GetItemByEAN (string ean);
        /// <summary>
        /// Find item by UPC code Returns a single item
        /// </summary>
        /// <param name="upc">UPC code of item to return</param>
        /// <returns>Item</returns>
        Item GetItemByUPC (string upc);
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ProductLookupApi : IProductLookupApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductLookupApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ProductLookupApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ProductLookupApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProductLookupApi(String basePath)
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
        /// Find item by asin code Returns a single item
        /// </summary>
        /// <param name="asin">ASIN code of item to return</param> 
        /// <returns>Item</returns>            
        public Item GetItemByASIN (string asin)
        {
            
            // verify the required parameter 'asin' is set
            if (asin == null) throw new ApiException(400, "Missing required parameter 'asin' when calling GetItemByASIN");
            
    
            var path = "/api/v1/asin/{asin}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "asin" + "}", ApiClient.ParameterToString(asin));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetItemByASIN: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetItemByASIN: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Item) ApiClient.Deserialize(response.Content, typeof(Item), response.Headers);
        }
    
        /// <summary>
        /// Find item by UPC code Returns a single item
        /// </summary>
        /// <param name="ean">EAN code of item to return</param> 
        /// <returns>Item</returns>            
        public Item GetItemByEAN (string ean)
        {
            
            // verify the required parameter 'ean' is set
            if (ean == null) throw new ApiException(400, "Missing required parameter 'ean' when calling GetItemByEAN");
            
    
            var path = "/api/v1/ean/{ean}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ean" + "}", ApiClient.ParameterToString(ean));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetItemByEAN: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetItemByEAN: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Item) ApiClient.Deserialize(response.Content, typeof(Item), response.Headers);
        }
    
        /// <summary>
        /// Find item by UPC code Returns a single item
        /// </summary>
        /// <param name="upc">UPC code of item to return</param> 
        /// <returns>Item</returns>            
        public Item GetItemByUPC (string upc)
        {
            
            // verify the required parameter 'upc' is set
            if (upc == null) throw new ApiException(400, "Missing required parameter 'upc' when calling GetItemByUPC");
            
    
            var path = "/api/v1/upc/{upc}";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "upc" + "}", ApiClient.ParameterToString(upc));
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling GetItemByUPC: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling GetItemByUPC: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Item) ApiClient.Deserialize(response.Content, typeof(Item), response.Headers);
        }
    
    }
}
