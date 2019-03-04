package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Item._

case class Item (
  upc: Option[String],
ean: Option[String],
isbn: Option[String],
asin: Option[String],
title: Option[String],
sku: Option[String],
mpn: Option[String],
partNumber: Option[String],
/* A list of matching upc codes. */
  upcs: Option[List[String]],
description: Option[String],
brand: Option[String],
manufacturer: Option[String],
color: Option[String],
newPrice: Option[BigDecimal],
usedPrice: Option[BigDecimal],
currencyCode: Option[String],
url: Option[String],
/* A list of product feature descriptions. */
  features: Option[List[String]],
/* Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms') */
  dimensions: Option[List[Any]],
/* A list product images. */
  images: Option[List[String]],
/* Matched items for this product. */
  matchedItems: Option[List[Any]],
/* A list of country codes from which this item belongs. */
  isoCountryCodes: Option[List[String]],
/* The company name registered to the product's UPC or EAN. */
  companyName: Option[String],
/* The company address registered to the product's UPC or EAN. */
  companyAddress: Option[String],
/* A list of categories for this product. */
  categories: Option[List[String]],
/* A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category. */
  categoryHierarchies: Option[List[String]])

object Item {
  import DateTimeCodecs._

  implicit val ItemCodecJson: CodecJson[Item] = CodecJson.derive[Item]
  implicit val ItemDecoder: EntityDecoder[Item] = jsonOf[Item]
  implicit val ItemEncoder: EntityEncoder[Item] = jsonEncoderOf[Item]
}
