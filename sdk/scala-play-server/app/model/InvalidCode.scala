package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for invalid_code.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2020-03-27T18:11:16.680-04:00[America/New_York]")
case class InvalidCode(
  message: Option[String],
  status: Option[Int]
)

object InvalidCode {
  implicit lazy val invalidCodeJsonFormat: Format[InvalidCode] = Json.format[InvalidCode]
}

