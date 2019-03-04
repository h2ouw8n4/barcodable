
package org.openapitools.client.model


case class InvalidCode (
    _message: Option[String],
    _status: Option[Integer]
)
object InvalidCode {
    def toStringBody(var_message: Object, var_status: Object) =
        s"""
        | {
        | "message":$var_message,"status":$var_status
        | }
        """.stripMargin
}
