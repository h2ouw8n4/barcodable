package api

import model.InlineResponse200
import model.InlineResponse400

/**
  * Provides a default implementation for [[ProductConversionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
class ProductConversionApiImpl extends ProductConversionApi {
  /**
    * @inheritdoc
    */
  override def convertCode(upc Pipe ean Pipe asin: String): InlineResponse200 = {
    // TODO: Implement better logic

    InlineResponse200(None, None, None, None)
  }
}
