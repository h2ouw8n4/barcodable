/*
 * Barcodable.com API
 *
 * Barcodable.com API
 *
 * API version: 1.5.0
 * Contact: support@barcodable.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"net/http"
)


// ProductConversionApiRouter defines the required methods for binding the api requests to a responses for the ProductConversionApi
// The ProductConversionApiRouter implementation should parse necessary information from the http request, 
// pass the data to a ProductConversionApiServicer to perform the required actions, then write the service results to the http response.
type ProductConversionApiRouter interface { 
	ConvertCode(http.ResponseWriter, *http.Request)
}
// ProductLookupApiRouter defines the required methods for binding the api requests to a responses for the ProductLookupApi
// The ProductLookupApiRouter implementation should parse necessary information from the http request, 
// pass the data to a ProductLookupApiServicer to perform the required actions, then write the service results to the http response.
type ProductLookupApiRouter interface { 
	GetItemByASIN(http.ResponseWriter, *http.Request)
	GetItemByEAN(http.ResponseWriter, *http.Request)
	GetItemByUPC(http.ResponseWriter, *http.Request)
}


// ProductConversionApiServicer defines the api actions for the ProductConversionApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type ProductConversionApiServicer interface { 
	ConvertCode(string) (interface{}, error)
}


// ProductLookupApiServicer defines the api actions for the ProductLookupApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type ProductLookupApiServicer interface { 
	GetItemByASIN(string) (interface{}, error)
	GetItemByEAN(string) (interface{}, error)
	GetItemByUPC(string) (interface{}, error)
}