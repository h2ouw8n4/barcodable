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
case class InlineResponse400(message: Option[String],
                status: Option[Int]
                )

object InlineResponse400 {
    /**
     * Creates the codec for converting InlineResponse400 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse400] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse400] = deriveEncoder
}
