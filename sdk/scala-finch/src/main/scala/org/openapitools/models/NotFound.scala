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
case class NotFound(message: Option[String],
                status: Option[Int]
                )

object NotFound {
    /**
     * Creates the codec for converting NotFound from and to JSON.
     */
    implicit val decoder: Decoder[NotFound] = deriveDecoder
    implicit val encoder: ObjectEncoder[NotFound] = deriveEncoder
}
