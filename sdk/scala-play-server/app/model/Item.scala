package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for item.
  * @param upcs A list of matching upc codes.
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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
case class Item(
  upc: Option[String],
  ean: Option[String],
  isbn: Option[String],
  asin: Option[String],
  title: Option[String],
  sku: Option[String],
  mpn: Option[String],
  partNumber: Option[String],
  upcs: Option[List[String]],
  description: Option[String],
  brand: Option[String],
  manufacturer: Option[String],
  color: Option[String],
  newPrice: Option[BigDecimal],
  usedPrice: Option[BigDecimal],
  currencyCode: Option[String],
  url: Option[String],
  features: Option[List[String]],
  dimensions: Option[List[JsObject]],
  images: Option[List[String]],
  matchedItems: Option[List[JsObject]],
  isoCountryCodes: Option[List[String]],
  companyName: Option[String],
  companyAddress: Option[String],
  categories: Option[List[String]],
  categoryHierarchies: Option[List[String]]
)

object Item {
  implicit lazy val itemJsonFormat: Format[Item] = Json.format[Item]
}

