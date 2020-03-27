package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for inline_response_400.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
case class InlineResponse400(
  message: Option[String],
  status: Option[Int]
)

object InlineResponse400 {
  implicit lazy val inlineResponse400JsonFormat: Format[InlineResponse400] = Json.format[InlineResponse400]
}

