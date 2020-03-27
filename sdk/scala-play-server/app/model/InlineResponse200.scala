package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for inline_response_200.
  * @param upcs A list of UPCs
  * @param eans A list of EANs
  * @param asins A list of ASINs
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
case class InlineResponse200(
  upcs: Option[List[String]],
  eans: Option[List[String]],
  asins: Option[List[String]],
  message: Option[String]
)

object InlineResponse200 {
  implicit lazy val inlineResponse200JsonFormat: Format[InlineResponse200] = Json.format[InlineResponse200]
}

