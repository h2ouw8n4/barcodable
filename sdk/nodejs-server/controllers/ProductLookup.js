'use strict';

var utils = require('../utils/writer.js');
var ProductLookup = require('../service/ProductLookupService');

module.exports.getItemByASIN = function getItemByASIN (req, res, next) {
  var asin = req.swagger.params['asin'].value;
  ProductLookup.getItemByASIN(asin)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getItemByEAN = function getItemByEAN (req, res, next) {
  var ean = req.swagger.params['ean'].value;
  ProductLookup.getItemByEAN(ean)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getItemByUPC = function getItemByUPC (req, res, next) {
  var upc = req.swagger.params['upc'].value;
  ProductLookup.getItemByUPC(upc)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
