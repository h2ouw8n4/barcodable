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
// InlineResponse200 struct for InlineResponse200
type InlineResponse200 struct {
	// A list of UPCs
	Upcs []string `json:"upcs,omitempty"`
	// A list of EANs
	Eans []string `json:"eans,omitempty"`
	// A list of ASINs
	Asins []string `json:"asins,omitempty"`
	Message string `json:"message,omitempty"`
}
