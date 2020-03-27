/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Convert between UPC, EAN, and ASIN product codes.
* Returns the converted UPC, EAN, and ASIN codes.
*
* upc Pipe ean Pipe asin String UPC, EAN, or ASIN
* returns inline_response_200
* */
const convertCode = ({ upc Pipe ean Pipe asin }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        upc Pipe ean Pipe asin,
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
  convertCode,
};
