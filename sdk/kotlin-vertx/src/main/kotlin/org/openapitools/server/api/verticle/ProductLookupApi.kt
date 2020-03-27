package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.InvalidCode
import org.openapitools.server.api.model.Item
import org.openapitools.server.api.model.NotFound
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface ProductLookupApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* getItemByASIN
     * Find item by asin code */
    suspend fun getItemByASIN(asin:kotlin.String?,context:OperationRequest):Response<Item>
    /* getItemByEAN
     * Find item by UPC code */
    suspend fun getItemByEAN(ean:kotlin.String?,context:OperationRequest):Response<Item>
    /* getItemByUPC
     * Find item by UPC code */
    suspend fun getItemByUPC(upc:kotlin.String?,context:OperationRequest):Response<Item>
    companion object {
        const val address = "ProductLookupApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in ProductLookupApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ProductLookupApi::class.java, address)
            return routerFactory
        }
    }
}
