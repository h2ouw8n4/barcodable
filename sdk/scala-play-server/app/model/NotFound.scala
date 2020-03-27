package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for not_found.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
case class NotFound(
  message: Option[String],
  status: Option[Int]
)

object NotFound {
  implicit lazy val notFoundJsonFormat: Format[NotFound] = Json.format[NotFound]
}

