package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

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
data class Item(

    @JsonProperty("upc") val upc: kotlin.String? = null,

    @JsonProperty("ean") val ean: kotlin.String? = null,

    @JsonProperty("isbn") val isbn: kotlin.String? = null,

    @JsonProperty("asin") val asin: kotlin.String? = null,

    @JsonProperty("title") val title: kotlin.String? = null,

    @JsonProperty("sku") val sku: kotlin.String? = null,

    @JsonProperty("mpn") val mpn: kotlin.String? = null,

    @JsonProperty("part_number") val partNumber: kotlin.String? = null,

    @JsonProperty("upcs") val upcs: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("description") val description: kotlin.String? = null,

    @JsonProperty("brand") val brand: kotlin.String? = null,

    @JsonProperty("manufacturer") val manufacturer: kotlin.String? = null,

    @JsonProperty("color") val color: kotlin.String? = null,

    @JsonProperty("new_price") val newPrice: java.math.BigDecimal? = null,

    @JsonProperty("used_price") val usedPrice: java.math.BigDecimal? = null,

    @JsonProperty("currency_code") val currencyCode: kotlin.String? = null,

    @JsonProperty("url") val url: kotlin.String? = null,

    @JsonProperty("features") val features: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("dimensions") val dimensions: kotlin.collections.List<kotlin.Any>? = null,

    @JsonProperty("images") val images: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("matched_items") val matchedItems: kotlin.collections.List<kotlin.Any>? = null,

    @JsonProperty("iso_country_codes") val isoCountryCodes: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("company_name") val companyName: kotlin.String? = null,

    @JsonProperty("company_address") val companyAddress: kotlin.String? = null,

    @JsonProperty("categories") val categories: kotlin.collections.List<kotlin.String>? = null,

    @JsonProperty("category_hierarchies") val categoryHierarchies: kotlin.collections.List<kotlin.String>? = null
) {

}

