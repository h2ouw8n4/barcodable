package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProductLookupApiVerticle())
}

class ProductLookupApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProductLookupApiImpl").newInstance() as ProductLookupApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProductLookupApi.address)
            .register(ProductLookupApi::class.java,instance)
    }
}