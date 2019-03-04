package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

object ProductConversionApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def convertCode(host: String, upcEanAsin: String): Task[InlineResponse200] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse200] = jsonOf[InlineResponse200]

    val path = "/api/v1/convert/{upc | ean | asin}".replaceAll("\\{" + "upc | ean | asin" + "\\}",escape(upcEanAsin.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse200](req)

    } yield resp
  }
  
}

class HttpServiceProductConversionApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def convertCode(upcEanAsin: String): Task[InlineResponse200] = {
    implicit val returnTypeDecoder: EntityDecoder[InlineResponse200] = jsonOf[InlineResponse200]

    val path = "/api/v1/convert/{upc | ean | asin}".replaceAll("\\{" + "upc | ean | asin" + "\\}",escape(upcEanAsin.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[InlineResponse200](req)

    } yield resp
  }
  
}
