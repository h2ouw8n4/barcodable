<?php

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


namespace App\Http\Controllers;

use Illuminate\Support\Facades\Request;

class ProductConversionApi extends Controller
{
    /**
     * Constructor
     */
    public function __construct()
    {
    }

    /**
     * Operation convertCode
     *
     * Convert between UPC, EAN, and ASIN product codes..
     *
     * @param string $upc___ean___asin UPC, EAN, or ASIN (required)
     *
     * @return Http response
     */
    public function convertCode($upc___ean___asin)
    {
        $input = Request::all();

        //path params validation


        //not path params validation

        return response('How about implementing convertCode as a get method ?');
    }
}
