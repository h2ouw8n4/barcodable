package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param message 
 * @param status 
 */
case class InvalidCode(message: Option[String],
                status: Option[Int]
                )

object InvalidCode {
    /**
     * Creates the codec for converting InvalidCode from and to JSON.
     */
    implicit val decoder: Decoder[InvalidCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[InvalidCode] = deriveEncoder
}
