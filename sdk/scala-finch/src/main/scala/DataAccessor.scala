package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A InlineResponse200
        */
        def ProductConversion_convertCode(upc Pipe ean Pipe asin: String): Either[CommonError,InlineResponse200] = Left(TODO)

        /**
        * 
        * @return A Item
        */
        def ProductLookup_getItemByASIN(asin: String): Either[CommonError,Item] = Left(TODO)

        /**
        * 
        * @return A Item
        */
        def ProductLookup_getItemByEAN(ean: String): Either[CommonError,Item] = Left(TODO)

        /**
        * 
        * @return A Item
        */
        def ProductLookup_getItemByUPC(upc: String): Either[CommonError,Item] = Left(TODO)

}