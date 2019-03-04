
package org.openapitools.client.model


case class InlineResponse200 (
    /* A list of UPCs */
    _upcs: Option[List[String]],
    /* A list of EANs */
    _eans: Option[List[String]],
    /* A list of ASINs */
    _asins: Option[List[String]],
    _message: Option[String]
)
object InlineResponse200 {
    def toStringBody(var_upcs: Object, var_eans: Object, var_asins: Object, var_message: Object) =
        s"""
        | {
        | "upcs":$var_upcs,"eans":$var_eans,"asins":$var_asins,"message":$var_message
        | }
        """.stripMargin
}
