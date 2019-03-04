package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param upc 
 * @param ean 
 * @param isbn 
 * @param asin 
 * @param title 
 * @param sku 
 * @param mpn 
 * @param partNumber 
 * @param upcs A list of matching upc codes.
 * @param description 
 * @param brand 
 * @param manufacturer 
 * @param color 
 * @param newPrice 
 * @param usedPrice 
 * @param currencyCode 
 * @param url 
 * @param features A list of product feature descriptions.
 * @param dimensions Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
 * @param images A list product images.
 * @param matchedItems Matched items for this product.
 * @param isoCountryCodes A list of country codes from which this item belongs.
 * @param companyName The company name registered to the product's UPC or EAN.
 * @param companyAddress The company address registered to the product's UPC or EAN.
 * @param categories A list of categories for this product.
 * @param categoryHierarchies A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
 */
data class Item (

        @JsonProperty("upc") val upc: String? = null,

        @JsonProperty("ean") val ean: String? = null,

        @JsonProperty("isbn") val isbn: String? = null,

        @JsonProperty("asin") val asin: String? = null,

        @JsonProperty("title") val title: String? = null,

        @JsonProperty("sku") val sku: String? = null,

        @JsonProperty("mpn") val mpn: String? = null,

        @JsonProperty("part_number") val partNumber: String? = null,

        @JsonProperty("upcs") val upcs: List<String>? = null,

        @JsonProperty("description") val description: String? = null,

        @JsonProperty("brand") val brand: String? = null,

        @JsonProperty("manufacturer") val manufacturer: String? = null,

        @JsonProperty("color") val color: String? = null,

        @JsonProperty("new_price") val newPrice: java.math.BigDecimal? = null,

        @JsonProperty("used_price") val usedPrice: java.math.BigDecimal? = null,

        @JsonProperty("currency_code") val currencyCode: String? = null,

        @JsonProperty("url") val url: String? = null,

        @JsonProperty("features") val features: List<String>? = null,

        @JsonProperty("dimensions") val dimensions: List<Any>? = null,

        @JsonProperty("images") val images: List<String>? = null,

        @JsonProperty("matched_items") val matchedItems: List<Any>? = null,

        @JsonProperty("iso_country_codes") val isoCountryCodes: List<String>? = null,

        @JsonProperty("company_name") val companyName: String? = null,

        @JsonProperty("company_address") val companyAddress: String? = null,

        @JsonProperty("categories") val categories: List<String>? = null,

        @JsonProperty("category_hierarchies") val categoryHierarchies: List<String>? = null
) {

}

