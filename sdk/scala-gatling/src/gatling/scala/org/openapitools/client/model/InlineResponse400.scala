
package org.openapitools.client.model


case class InlineResponse400 (
    _message: Option[String],
    _status: Option[Integer]
)
object InlineResponse400 {
    def toStringBody(var_message: Object, var_status: Object) =
        s"""
        | {
        | "message":$var_message,"status":$var_status
        | }
        """.stripMargin
}
