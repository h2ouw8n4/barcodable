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
	"strings"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name        string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method      string
	// Pattern is the pattern of the URI.
	Pattern     string
	// HandlerFunc is the handler function of this route.
	HandlerFunc gin.HandlerFunc
}

// Routes is the list of the generated Route.
type Routes []Route

// NewRouter returns a new router.
func NewRouter() *gin.Engine {
	router := gin.Default()
	for _, route := range routes {
		switch route.Method {
		case "GET":
			router.GET(route.Pattern, route.HandlerFunc)
		case "POST":
			router.POST(route.Pattern, route.HandlerFunc)
		case "PUT":
			router.PUT(route.Pattern, route.HandlerFunc)
		case "DELETE":
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Index is the index handler.
func Index(c *gin.Context) {
	c.String(http.StatusOK, "Hello World!")
}

var routes = Routes{
	{
		"Index",
		"GET",
		"/magicCashew/barcodable/1.0.0/",
		Index,
	},

	{
		"ConvertCode",
		strings.ToUpper("Get"),
		"/magicCashew/barcodable/1.0.0/api/v1/convert/:upc | ean | asin",
		ConvertCode,
	},

	{
		"GetItemByASIN",
		strings.ToUpper("Get"),
		"/magicCashew/barcodable/1.0.0/api/v1/asin/:asin",
		GetItemByASIN,
	},

	{
		"GetItemByEAN",
		strings.ToUpper("Get"),
		"/magicCashew/barcodable/1.0.0/api/v1/ean/:ean",
		GetItemByEAN,
	},

	{
		"GetItemByUPC",
		strings.ToUpper("Get"),
		"/magicCashew/barcodable/1.0.0/api/v1/upc/:upc",
		GetItemByUPC,
	},
}
