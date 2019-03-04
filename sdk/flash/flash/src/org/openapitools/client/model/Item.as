package org.openapitools.client.model {

import org.openapitools.client.model.Object;

    [XmlRootNode(name="Item")]
    public class Item {
                [XmlElement(name="upc")]
        public var upc: String = null;
                [XmlElement(name="ean")]
        public var ean: String = null;
                [XmlElement(name="isbn")]
        public var isbn: String = null;
                [XmlElement(name="asin")]
        public var asin: String = null;
                [XmlElement(name="title")]
        public var title: String = null;
                [XmlElement(name="sku")]
        public var sku: String = null;
                [XmlElement(name="mpn")]
        public var mpn: String = null;
                [XmlElement(name="part_number")]
        public var partNumber: String = null;
        /* A list of matching upc codes. */
        // This declaration below of _upcs_obj_class is to force flash compiler to include this class
        private var _upcs_obj_class: Array = null;
        [XmlElementWrapper(name="upcs")]
        [XmlElements(name="upcs", type="Array")]
                public var upcs: Array = new Array();
                [XmlElement(name="description")]
        public var description: String = null;
                [XmlElement(name="brand")]
        public var brand: String = null;
                [XmlElement(name="manufacturer")]
        public var manufacturer: String = null;
                [XmlElement(name="color")]
        public var color: String = null;
                [XmlElement(name="new_price")]
        public var newPrice: Number = 0.0;
                [XmlElement(name="used_price")]
        public var usedPrice: Number = 0.0;
                [XmlElement(name="currency_code")]
        public var currencyCode: String = null;
                [XmlElement(name="url")]
        public var url: String = null;
        /* A list of product feature descriptions. */
        // This declaration below of _features_obj_class is to force flash compiler to include this class
        private var _features_obj_class: Array = null;
        [XmlElementWrapper(name="features")]
        [XmlElements(name="features", type="Array")]
                public var features: Array = new Array();
        /* Product dimensions and weight.  (&#39;meters&#39;, &#39;centimeters&#39;, &#39;millimeters&#39;, &#39;inches&#39;, &#39;feet&#39;, &#39;yards&#39;, &#39;ounces&#39;, &#39;pounds&#39;, &#39;grams&#39;, &#39;milligrams&#39;, &#39;kilograms&#39;) */
        // This declaration below of _dimensions_obj_class is to force flash compiler to include this class
        private var _dimensions_obj_class: Array = null;
        [XmlElementWrapper(name="dimensions")]
        [XmlElements(name="dimensions", type="Array")]
                public var dimensions: Array = new Array();
        /* A list product images. */
        // This declaration below of _images_obj_class is to force flash compiler to include this class
        private var _images_obj_class: Array = null;
        [XmlElementWrapper(name="images")]
        [XmlElements(name="images", type="Array")]
                public var images: Array = new Array();
        /* Matched items for this product. */
        // This declaration below of _matchedItems_obj_class is to force flash compiler to include this class
        private var _matchedItems_obj_class: Array = null;
        [XmlElementWrapper(name="matched_items")]
        [XmlElements(name="matchedItems", type="Array")]
                public var matchedItems: Array = new Array();
        /* A list of country codes from which this item belongs. */
        // This declaration below of _isoCountryCodes_obj_class is to force flash compiler to include this class
        private var _isoCountryCodes_obj_class: Array = null;
        [XmlElementWrapper(name="iso_country_codes")]
        [XmlElements(name="isoCountryCodes", type="Array")]
                public var isoCountryCodes: Array = new Array();
        /* The company name registered to the product&#39;s UPC or EAN. */
        [XmlElement(name="company_name")]
        public var companyName: String = null;
        /* The company address registered to the product&#39;s UPC or EAN. */
        [XmlElement(name="company_address")]
        public var companyAddress: String = null;
        /* A list of categories for this product. */
        // This declaration below of _categories_obj_class is to force flash compiler to include this class
        private var _categories_obj_class: Array = null;
        [XmlElementWrapper(name="categories")]
        [XmlElements(name="categories", type="Array")]
                public var categories: Array = new Array();
        /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
        // This declaration below of _categoryHierarchies_obj_class is to force flash compiler to include this class
        private var _categoryHierarchies_obj_class: Array = null;
        [XmlElementWrapper(name="category_hierarchies")]
        [XmlElements(name="categoryHierarchies", type="Array")]
                public var categoryHierarchies: Array = new Array();

    public function toString(): String {
        var str: String = "Item: ";
        str += " (upc: " + upc + ")";
        str += " (ean: " + ean + ")";
        str += " (isbn: " + isbn + ")";
        str += " (asin: " + asin + ")";
        str += " (title: " + title + ")";
        str += " (sku: " + sku + ")";
        str += " (mpn: " + mpn + ")";
        str += " (partNumber: " + partNumber + ")";
        str += " (upcs: " + upcs + ")";
        str += " (description: " + description + ")";
        str += " (brand: " + brand + ")";
        str += " (manufacturer: " + manufacturer + ")";
        str += " (color: " + color + ")";
        str += " (newPrice: " + newPrice + ")";
        str += " (usedPrice: " + usedPrice + ")";
        str += " (currencyCode: " + currencyCode + ")";
        str += " (url: " + url + ")";
        str += " (features: " + features + ")";
        str += " (dimensions: " + dimensions + ")";
        str += " (images: " + images + ")";
        str += " (matchedItems: " + matchedItems + ")";
        str += " (isoCountryCodes: " + isoCountryCodes + ")";
        str += " (companyName: " + companyName + ")";
        str += " (companyAddress: " + companyAddress + ")";
        str += " (categories: " + categories + ")";
        str += " (categoryHierarchies: " + categoryHierarchies + ")";
        return str;
    }

}

}
