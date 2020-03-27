package api

import model.InlineResponse200
import model.InlineResponse400

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
trait ProductConversionApi {
  /**
    * Convert between UPC, EAN, and ASIN product codes.
    * Returns the converted UPC, EAN, and ASIN codes.
    * @param upc Pipe ean Pipe asin UPC, EAN, or ASIN
    */
  def convertCode(upc Pipe ean Pipe asin: String): InlineResponse200
}
