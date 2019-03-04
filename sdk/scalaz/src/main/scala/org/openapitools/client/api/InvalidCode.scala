package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InvalidCode._

case class InvalidCode (
  message: Option[String],
status: Option[Integer])

object InvalidCode {
  import DateTimeCodecs._

  implicit val InvalidCodeCodecJson: CodecJson[InvalidCode] = CodecJson.derive[InvalidCode]
  implicit val InvalidCodeDecoder: EntityDecoder[InvalidCode] = jsonOf[InvalidCode]
  implicit val InvalidCodeEncoder: EntityEncoder[InvalidCode] = jsonEncoderOf[InvalidCode]
}
