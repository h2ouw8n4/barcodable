package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import InlineResponse400._

case class InlineResponse400 (
  message: Option[String],
status: Option[Integer])

object InlineResponse400 {
  import DateTimeCodecs._

  implicit val InlineResponse400CodecJson: CodecJson[InlineResponse400] = CodecJson.derive[InlineResponse400]
  implicit val InlineResponse400Decoder: EntityDecoder[InlineResponse400] = jsonOf[InlineResponse400]
  implicit val InlineResponse400Encoder: EntityEncoder[InlineResponse400] = jsonEncoderOf[InlineResponse400]
}
