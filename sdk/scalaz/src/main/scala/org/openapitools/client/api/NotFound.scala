package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NotFound._

case class NotFound (
  message: Option[String],
status: Option[Integer])

object NotFound {
  import DateTimeCodecs._

  implicit val NotFoundCodecJson: CodecJson[NotFound] = CodecJson.derive[NotFound]
  implicit val NotFoundDecoder: EntityDecoder[NotFound] = jsonOf[NotFound]
  implicit val NotFoundEncoder: EntityEncoder[NotFound] = jsonEncoderOf[NotFound]
}
