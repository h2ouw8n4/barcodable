package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProductConversionApiVerticle())
}

class ProductConversionApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProductConversionApiImpl").newInstance() as ProductConversionApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProductConversionApi.address)
            .register(ProductConversionApi::class.java,instance)
    }
}