'use strict';

var utils = require('../utils/writer.js');
var ProductConversion = require('../service/ProductConversionService');

module.exports.convertCode = function convertCode (req, res, next) {
  var upc Pipe ean Pipe asin = req.swagger.params['upc | ean | asin'].value;
  ProductConversion.convertCode(upc Pipe ean Pipe asin)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
