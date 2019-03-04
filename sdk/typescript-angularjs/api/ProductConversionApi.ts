/**
 * Barcodable.com API
 * Barcodable.com API
 *
 * OpenAPI spec version: 1.5.0
 * Contact: support@barcodable.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class ProductConversionApi {
    protected basePath = 'https://virtserver.swaggerhub.com/magicCashew/barcodable/1.0.0';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * Returns the converted UPC, EAN, and ASIN codes.
     * @summary Convert between UPC, EAN, and ASIN product codes.
     * @param upcEanAsin UPC, EAN, or ASIN
     */
    public convertCode (upcEanAsin: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.InlineResponse200> {
        const localVarPath = this.basePath + '/api/v1/convert/{upc | ean | asin}'
            .replace('{' + 'upc | ean | asin' + '}', encodeURIComponent(String(upcEanAsin)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'upcEanAsin' is not null or undefined
        if (upcEanAsin === null || upcEanAsin === undefined) {
            throw new Error('Required parameter upcEanAsin was null or undefined when calling convertCode.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'GET',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}
