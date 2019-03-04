'use strict';


/**
 * Find item by asin code
 * Returns a single item
 *
 * asin String ASIN code of item to return
 * returns item
 **/
exports.getItemByASIN = function(asin) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "color" : "Black",
  "iso_country_codes" : [ "US", "GB" ],
  "isbn" : "9780198155795",
  "description" : "The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!",
  "title" : "Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black)",
  "currency_code" : "USD",
  "company_address" : "101 Infinite Loop, Cupertino, CA 95014",
  "manufacturer" : "Apple",
  "features" : [ "Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.", "The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor." ],
  "ean" : "190198155795",
  "used_price" : 659.95,
  "categories" : [ "Unlocked Cell Phones", "Electronics" ],
  "sku" : "903061477",
  "brand" : "Apple",
  "images" : [ "https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg", "https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg" ],
  "upc" : "190198155795",
  "mpn" : "A1660",
  "new_price" : 799.95,
  "matched_items" : [ "{}", "{}" ],
  "url" : "https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4",
  "company_name" : "Apple Inc.",
  "part_number" : "14",
  "asin" : "B01M1EXQY4",
  "upcs" : [ "190198071835, 647627503790, 759776410383, 190198068507" ],
  "category_hierarchies" : [ [ "Cell Phones & Accessories", "Cell Phones", "Unlocked Cell Phones" ] ],
  "dimensions" : [ "{}", "{}" ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Find item by UPC code
 * Returns a single item
 *
 * ean String EAN code of item to return
 * returns item
 **/
exports.getItemByEAN = function(ean) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "color" : "Black",
  "iso_country_codes" : [ "US", "GB" ],
  "isbn" : "9780198155795",
  "description" : "The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!",
  "title" : "Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black)",
  "currency_code" : "USD",
  "company_address" : "101 Infinite Loop, Cupertino, CA 95014",
  "manufacturer" : "Apple",
  "features" : [ "Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.", "The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor." ],
  "ean" : "190198155795",
  "used_price" : 659.95,
  "categories" : [ "Unlocked Cell Phones", "Electronics" ],
  "sku" : "903061477",
  "brand" : "Apple",
  "images" : [ "https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg", "https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg" ],
  "upc" : "190198155795",
  "mpn" : "A1660",
  "new_price" : 799.95,
  "matched_items" : [ "{}", "{}" ],
  "url" : "https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4",
  "company_name" : "Apple Inc.",
  "part_number" : "14",
  "asin" : "B01M1EXQY4",
  "upcs" : [ "190198071835, 647627503790, 759776410383, 190198068507" ],
  "category_hierarchies" : [ [ "Cell Phones & Accessories", "Cell Phones", "Unlocked Cell Phones" ] ],
  "dimensions" : [ "{}", "{}" ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Find item by UPC code
 * Returns a single item
 *
 * upc String UPC code of item to return
 * returns item
 **/
exports.getItemByUPC = function(upc) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "color" : "Black",
  "iso_country_codes" : [ "US", "GB" ],
  "isbn" : "9780198155795",
  "description" : "The latest iPhone with advanced camera, better battery life, immersive speakers and water resistance!",
  "title" : "Apple iPhone 7 Unlocked Phone 128 GB - US Version (Black)",
  "currency_code" : "USD",
  "company_address" : "101 Infinite Loop, Cupertino, CA 95014",
  "manufacturer" : "Apple",
  "features" : [ "Smooth, continuous unibody design. 3D Touch, Live Photos, an A9 chip, advanced cameras, and a 4.7-inch Retina HD display. And so much more.", "The most advanced chip ever in a smartphone is even faster and now features an integrated M9 motion coprocessor." ],
  "ean" : "190198155795",
  "used_price" : 659.95,
  "categories" : [ "Unlocked Cell Phones", "Electronics" ],
  "sku" : "903061477",
  "brand" : "Apple",
  "images" : [ "https://images-na.ssl-images-amazon.com/images/I/317AuSoRaHL.jpg", "https://images-na.ssl-images-amazon.com/images/I/41Whf3N9i2L.jpg" ],
  "upc" : "190198155795",
  "mpn" : "A1660",
  "new_price" : 799.95,
  "matched_items" : [ "{}", "{}" ],
  "url" : "https://www.amazon.com/Apple-iPhone-Unlocked-Phone-128/dp/B01M1EXQY4",
  "company_name" : "Apple Inc.",
  "part_number" : "14",
  "asin" : "B01M1EXQY4",
  "upcs" : [ "190198071835, 647627503790, 759776410383, 190198068507" ],
  "category_hierarchies" : [ [ "Cell Phones & Accessories", "Cell Phones", "Unlocked Cell Phones" ] ],
  "dimensions" : [ "{}", "{}" ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

