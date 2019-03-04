package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.math.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param upc 
 * @param ean 
 * @param isbn 
 * @param asin 
 * @param title 
 * @param sku 
 * @param mpn 
 * @param partUnderscorenumber 
 * @param upcs A list of matching upc codes.
 * @param description 
 * @param brand 
 * @param manufacturer 
 * @param color 
 * @param newUnderscoreprice 
 * @param usedUnderscoreprice 
 * @param currencyUnderscorecode 
 * @param url 
 * @param features A list of product feature descriptions.
 * @param dimensions Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
 * @param images A list product images.
 * @param matchedUnderscoreitems Matched items for this product.
 * @param isoUnderscorecountryUnderscorecodes A list of country codes from which this item belongs.
 * @param companyUnderscorename The company name registered to the product's UPC or EAN.
 * @param companyUnderscoreaddress The company address registered to the product's UPC or EAN.
 * @param categories A list of categories for this product.
 * @param categoryUnderscorehierarchies A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
 */
case class Item(upc: Option[String],
                ean: Option[String],
                isbn: Option[String],
                asin: Option[String],
                title: Option[String],
                sku: Option[String],
                mpn: Option[String],
                partUnderscorenumber: Option[String],
                upcs: Option[Seq[String]],
                description: Option[String],
                brand: Option[String],
                manufacturer: Option[String],
                color: Option[String],
                newUnderscoreprice: Option[BigDecimal],
                usedUnderscoreprice: Option[BigDecimal],
                currencyUnderscorecode: Option[String],
                url: Option[String],
                features: Option[Seq[String]],
                dimensions: Option[Seq[Object]],
                images: Option[Seq[String]],
                matchedUnderscoreitems: Option[Seq[Object]],
                isoUnderscorecountryUnderscorecodes: Option[Seq[String]],
                companyUnderscorename: Option[String],
                companyUnderscoreaddress: Option[String],
                categories: Option[Seq[String]],
                categoryUnderscorehierarchies: Option[Seq[String]]
                )

object Item {
    /**
     * Creates the codec for converting Item from and to JSON.
     */
    implicit val decoder: Decoder[Item] = deriveDecoder
    implicit val encoder: ObjectEncoder[Item] = deriveEncoder
}
