goog.provide('API.Client.item');

/**
 * @record
 */
API.Client.Item = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.upc;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.ean;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.isbn;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.asin;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.sku;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.mpn;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.partNumber;

/**
 * A list of matching upc codes.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Item.prototype.upcs;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.brand;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.manufacturer;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.color;

/**
 * @type {!number}
 * @export
 */
API.Client.Item.prototype.newPrice;

/**
 * @type {!number}
 * @export
 */
API.Client.Item.prototype.usedPrice;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.currencyCode;

/**
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.url;

/**
 * A list of product feature descriptions.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Item.prototype.features;

/**
 * Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
 * @type {!Array<!API.Client.Object>}
 * @export
 */
API.Client.Item.prototype.dimensions;

/**
 * A list product images.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Item.prototype.images;

/**
 * Matched items for this product.
 * @type {!Array<!API.Client.Object>}
 * @export
 */
API.Client.Item.prototype.matchedItems;

/**
 * A list of country codes from which this item belongs.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Item.prototype.isoCountryCodes;

/**
 * The company name registered to the product's UPC or EAN.
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.companyName;

/**
 * The company address registered to the product's UPC or EAN.
 * @type {!string}
 * @export
 */
API.Client.Item.prototype.companyAddress;

/**
 * A list of categories for this product.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Item.prototype.categories;

/**
 * A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
 * @type {!Array<!string>}
 * @export
 */
API.Client.Item.prototype.categoryHierarchies;

