
package org.openapitools.client.model


case class Item (
    _upc: Option[String],
    _ean: Option[String],
    _isbn: Option[String],
    _asin: Option[String],
    _title: Option[String],
    _sku: Option[String],
    _mpn: Option[String],
    _partUnderscorenumber: Option[String],
    /* A list of matching upc codes. */
    _upcs: Option[List[String]],
    _description: Option[String],
    _brand: Option[String],
    _manufacturer: Option[String],
    _color: Option[String],
    _newUnderscoreprice: Option[Number],
    _usedUnderscoreprice: Option[Number],
    _currencyUnderscorecode: Option[String],
    _url: Option[String],
    /* A list of product feature descriptions. */
    _features: Option[List[String]],
    /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
    _dimensions: Option[List[Any]],
    /* A list product images. */
    _images: Option[List[String]],
    /* Matched items for this product. */
    _matchedUnderscoreitems: Option[List[Any]],
    /* A list of country codes from which this item belongs. */
    _isoUnderscorecountryUnderscorecodes: Option[List[String]],
    /* The company name registered to the product's UPC or EAN. */
    _companyUnderscorename: Option[String],
    /* The company address registered to the product's UPC or EAN. */
    _companyUnderscoreaddress: Option[String],
    /* A list of categories for this product. */
    _categories: Option[List[String]],
    /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
    _categoryUnderscorehierarchies: Option[List[String]]
)
object Item {
    def toStringBody(var_upc: Object, var_ean: Object, var_isbn: Object, var_asin: Object, var_title: Object, var_sku: Object, var_mpn: Object, var_partUnderscorenumber: Object, var_upcs: Object, var_description: Object, var_brand: Object, var_manufacturer: Object, var_color: Object, var_newUnderscoreprice: Object, var_usedUnderscoreprice: Object, var_currencyUnderscorecode: Object, var_url: Object, var_features: Object, var_dimensions: Object, var_images: Object, var_matchedUnderscoreitems: Object, var_isoUnderscorecountryUnderscorecodes: Object, var_companyUnderscorename: Object, var_companyUnderscoreaddress: Object, var_categories: Object, var_categoryUnderscorehierarchies: Object) =
        s"""
        | {
        | "upc":$var_upc,"ean":$var_ean,"isbn":$var_isbn,"asin":$var_asin,"title":$var_title,"sku":$var_sku,"mpn":$var_mpn,"partUnderscorenumber":$var_partUnderscorenumber,"upcs":$var_upcs,"description":$var_description,"brand":$var_brand,"manufacturer":$var_manufacturer,"color":$var_color,"newUnderscoreprice":$var_newUnderscoreprice,"usedUnderscoreprice":$var_usedUnderscoreprice,"currencyUnderscorecode":$var_currencyUnderscorecode,"url":$var_url,"features":$var_features,"dimensions":$var_dimensions,"images":$var_images,"matchedUnderscoreitems":$var_matchedUnderscoreitems,"isoUnderscorecountryUnderscorecodes":$var_isoUnderscorecountryUnderscorecodes,"companyUnderscorename":$var_companyUnderscorename,"companyUnderscoreaddress":$var_companyUnderscoreaddress,"categories":$var_categories,"categoryUnderscorehierarchies":$var_categoryUnderscorehierarchies
        | }
        """.stripMargin
}
