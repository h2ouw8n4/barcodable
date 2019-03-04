'use strict';


/**
 * Convert between UPC, EAN, and ASIN product codes.
 * Returns the converted UPC, EAN, and ASIN codes.
 *
 * upc Pipe ean Pipe asin String UPC, EAN, or ASIN
 * returns inline_response_200
 **/
exports.convertCode = function(upc Pipe ean Pipe asin) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "asins" : [ "B01M1EXQY4" ],
  "message" : "OK",
  "upcs" : [ "190198155795" ],
  "eans" : [ 1.90198155795E11 ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

