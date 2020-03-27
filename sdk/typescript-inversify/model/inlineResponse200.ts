/**
 * Barcodable.com API
 * Barcodable.com API
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: support@barcodable.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface InlineResponse200 { 
    /**
     * A list of UPCs
     */
    upcs?: Array<string>;
    /**
     * A list of EANs
     */
    eans?: Array<string>;
    /**
     * A list of ASINs
     */
    asins?: Array<string>;
    message?: string;
}
