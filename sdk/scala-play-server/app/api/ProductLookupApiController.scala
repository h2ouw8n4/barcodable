package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.InvalidCode
import model.Item
import model.NotFound

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
@Singleton
class ProductLookupApiController @Inject()(cc: ControllerComponents, api: ProductLookupApi) extends AbstractController(cc) {
  /**
    * GET /magicCashew/barcodable/1.0.0/api/v1/asin/:asin
    * @param asin ASIN code of item to return
    */
  def getItemByASIN(asin: String): Action[AnyContent] = Action { request =>
    def executeApi(): Item = {
      api.getItemByASIN(asin)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /magicCashew/barcodable/1.0.0/api/v1/ean/:ean
    * @param ean EAN code of item to return
    */
  def getItemByEAN(ean: String): Action[AnyContent] = Action { request =>
    def executeApi(): Item = {
      api.getItemByEAN(ean)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /magicCashew/barcodable/1.0.0/api/v1/upc/:upc
    * @param upc UPC code of item to return
    */
  def getItemByUPC(upc: String): Action[AnyContent] = Action { request =>
    def executeApi(): Item = {
      api.getItemByUPC(upc)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
