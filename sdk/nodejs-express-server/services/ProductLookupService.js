/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Find item by asin code
* Returns a single item
*
* asin String ASIN code of item to return
* returns item
* */
const getItemByASIN = ({ asin }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        asin,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Find item by UPC code
* Returns a single item
*
* ean String EAN code of item to return
* returns item
* */
const getItemByEAN = ({ ean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ean,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Find item by UPC code
* Returns a single item
*
* upc String UPC code of item to return
* returns item
* */
const getItemByUPC = ({ upc }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        upc,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getItemByASIN,
  getItemByEAN,
  getItemByUPC,
};
