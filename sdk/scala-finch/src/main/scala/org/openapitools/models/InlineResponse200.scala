package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param upcs A list of UPCs
 * @param eans A list of EANs
 * @param asins A list of ASINs
 * @param message 
 */
case class InlineResponse200(upcs: Option[Seq[String]],
                eans: Option[Seq[String]],
                asins: Option[Seq[String]],
                message: Option[String]
                )

object InlineResponse200 {
    /**
     * Creates the codec for converting InlineResponse200 from and to JSON.
     */
    implicit val decoder: Decoder[InlineResponse200] = deriveDecoder
    implicit val encoder: ObjectEncoder[InlineResponse200] = deriveEncoder
}
