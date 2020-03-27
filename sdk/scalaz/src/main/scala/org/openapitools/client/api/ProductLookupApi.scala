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

import org.openapitools.client.api.InvalidCode
import org.openapitools.client.api.Item
import org.openapitools.client.api.NotFound

object ProductLookupApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getItemByASIN(host: String, asin: String): Task[Item] = {
    implicit val returnTypeDecoder: EntityDecoder[Item] = jsonOf[Item]

    val path = "/api/v1/asin/{asin}".replaceAll("\\{" + "asin" + "\\}",escape(asin.toString))
    
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
      resp          <- client.expect[Item](req)

    } yield resp
  }
  
  def getItemByEAN(host: String, ean: String): Task[Item] = {
    implicit val returnTypeDecoder: EntityDecoder[Item] = jsonOf[Item]

    val path = "/api/v1/ean/{ean}".replaceAll("\\{" + "ean" + "\\}",escape(ean.toString))
    
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
      resp          <- client.expect[Item](req)

    } yield resp
  }
  
  def getItemByUPC(host: String, upc: String): Task[Item] = {
    implicit val returnTypeDecoder: EntityDecoder[Item] = jsonOf[Item]

    val path = "/api/v1/upc/{upc}".replaceAll("\\{" + "upc" + "\\}",escape(upc.toString))
    
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
      resp          <- client.expect[Item](req)

    } yield resp
  }
  
}

class HttpServiceProductLookupApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getItemByASIN(asin: String): Task[Item] = {
    implicit val returnTypeDecoder: EntityDecoder[Item] = jsonOf[Item]

    val path = "/api/v1/asin/{asin}".replaceAll("\\{" + "asin" + "\\}",escape(asin.toString))
    
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
      resp          <- client.expect[Item](req)

    } yield resp
  }
  
  def getItemByEAN(ean: String): Task[Item] = {
    implicit val returnTypeDecoder: EntityDecoder[Item] = jsonOf[Item]

    val path = "/api/v1/ean/{ean}".replaceAll("\\{" + "ean" + "\\}",escape(ean.toString))
    
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
      resp          <- client.expect[Item](req)

    } yield resp
  }
  
  def getItemByUPC(upc: String): Task[Item] = {
    implicit val returnTypeDecoder: EntityDecoder[Item] = jsonOf[Item]

    val path = "/api/v1/upc/{upc}".replaceAll("\\{" + "upc" + "\\}",escape(upc.toString))
    
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
      resp          <- client.expect[Item](req)

    } yield resp
  }
  
}
