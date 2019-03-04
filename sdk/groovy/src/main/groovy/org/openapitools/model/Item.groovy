package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Canonical
class Item {
    String upc = 

    String ean = 

    String isbn = 

    String asin = 

    String title = 

    String sku = 

    String mpn = 

    String partNumber = 

    /* A list of matching upc codes. */
    List<String> upcs = new ArrayList<String>()

    String description = 

    String brand = 

    String manufacturer = 

    String color = 

    BigDecimal newPrice = 

    BigDecimal usedPrice = 

    String currencyCode = 

    String url = 

    /* A list of product feature descriptions. */
    List<String> features = new ArrayList<String>()

    /* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
    List<Object> dimensions = new ArrayList<Object>()

    /* A list product images. */
    List<String> images = new ArrayList<String>()

    /* Matched items for this product. */
    List<Object> matchedItems = new ArrayList<Object>()

    /* A list of country codes from which this item belongs. */
    List<String> isoCountryCodes = new ArrayList<String>()

    /* The company name registered to the product's UPC or EAN. */
    String companyName = 

    /* The company address registered to the product's UPC or EAN. */
    String companyAddress = 

    /* A list of categories for this product. */
    List<String> categories = new ArrayList<String>()

    /* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
    List<String> categoryHierarchies = new ArrayList<String>()

}
