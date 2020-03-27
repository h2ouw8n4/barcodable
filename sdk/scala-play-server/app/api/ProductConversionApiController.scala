package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.InlineResponse200
import model.InlineResponse400

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
@Singleton
class ProductConversionApiController @Inject()(cc: ControllerComponents, api: ProductConversionApi) extends AbstractController(cc) {
  /**
    * GET /magicCashew/barcodable/1.0.0/api/v1/convert/:upc | ean | asin
    * @param upc Pipe ean Pipe asin UPC, EAN, or ASIN
    */
  def convertCode(upc Pipe ean Pipe asin: String): Action[AnyContent] = Action { request =>
    def executeApi(): InlineResponse200 = {
      api.convertCode(upc Pipe ean Pipe asin)
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
