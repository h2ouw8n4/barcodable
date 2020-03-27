
package org.openapitools.client.model


case class Item (
    _upc: Option[String],
    _ean: Option[String],
    _isbn: Option[String],
    _asin: Option[String],
    _title: Option[String],
    _sku: Option[String],
    _mpn: Option[String],
    _partNumber: Option[String],
    /* A list of matching upc codes. */
    _upcs: Option[List[String]],
    _description: Option[String],
    _brand: Option[String],
    _manufacturer: Option[String],
    _color: Option[String],
    _newPrice: Option[Number],
    _usedPrice: Option[Number],
    _currencyCode: Option[String],
    _url: Option[String],
    /* A list of product feature descriptions. */
    _features: Option[List[String]],
    /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
    _dimensions: Option[List[Any]],
    /* A list product images. */
    _images: Option[List[String]],
    /* Matched items for this product. */
    _matchedItems: Option[List[Any]],
    /* A list of country codes from which this item belongs. */
    _isoCountryCodes: Option[List[String]],
    /* The company name registered to the product's UPC or EAN. */
    _companyName: Option[String],
    /* The company address registered to the product's UPC or EAN. */
    _companyAddress: Option[String],
    /* A list of categories for this product. */
    _categories: Option[List[String]],
    /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
    _categoryHierarchies: Option[List[String]]
)
object Item {
    def toStringBody(var_upc: Object, var_ean: Object, var_isbn: Object, var_asin: Object, var_title: Object, var_sku: Object, var_mpn: Object, var_partNumber: Object, var_upcs: Object, var_description: Object, var_brand: Object, var_manufacturer: Object, var_color: Object, var_newPrice: Object, var_usedPrice: Object, var_currencyCode: Object, var_url: Object, var_features: Object, var_dimensions: Object, var_images: Object, var_matchedItems: Object, var_isoCountryCodes: Object, var_companyName: Object, var_companyAddress: Object, var_categories: Object, var_categoryHierarchies: Object) =
        s"""
        | {
        | "upc":$var_upc,"ean":$var_ean,"isbn":$var_isbn,"asin":$var_asin,"title":$var_title,"sku":$var_sku,"mpn":$var_mpn,"partNumber":$var_partNumber,"upcs":$var_upcs,"description":$var_description,"brand":$var_brand,"manufacturer":$var_manufacturer,"color":$var_color,"newPrice":$var_newPrice,"usedPrice":$var_usedPrice,"currencyCode":$var_currencyCode,"url":$var_url,"features":$var_features,"dimensions":$var_dimensions,"images":$var_images,"matchedItems":$var_matchedItems,"isoCountryCodes":$var_isoCountryCodes,"companyName":$var_companyName,"companyAddress":$var_companyAddress,"categories":$var_categories,"categoryHierarchies":$var_categoryHierarchies
        | }
        """.stripMargin
}
