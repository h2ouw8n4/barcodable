package api

import model.InvalidCode
import model.Item
import model.NotFound

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
trait ProductLookupApi {
  /**
    * Find item by asin code
    * Returns a single item
    * @param asin ASIN code of item to return
    */
  def getItemByASIN(asin: String): Item

  /**
    * Find item by UPC code
    * Returns a single item
    * @param ean EAN code of item to return
    */
  def getItemByEAN(ean: String): Item

  /**
    * Find item by UPC code
    * Returns a single item
    * @param upc UPC code of item to return
    */
  def getItemByUPC(upc: String): Item
}
