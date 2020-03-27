package api

import model.InvalidCode
import model.Item
import model.NotFound

/**
  * Provides a default implementation for [[ProductLookupApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
class ProductLookupApiImpl extends ProductLookupApi {
  /**
    * @inheritdoc
    */
  override def getItemByASIN(asin: String): Item = {
    // TODO: Implement better logic

    Item(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getItemByEAN(ean: String): Item = {
    // TODO: Implement better logic

    Item(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getItemByUPC(upc: String): Item = {
    // TODO: Implement better logic

    Item(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
