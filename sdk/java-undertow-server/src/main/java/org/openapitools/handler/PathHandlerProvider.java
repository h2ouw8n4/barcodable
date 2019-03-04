package org.openapitools.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.GET, "/mindviser/barcodable/1.0.0/api/v1/convert/{upc | ean | asin}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("convertCode");
                        }
                    })


            .add(Methods.GET, "/mindviser/barcodable/1.0.0/api/v1/asin/{asin}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getItemByASIN");
                        }
                    })


            .add(Methods.GET, "/mindviser/barcodable/1.0.0/api/v1/ean/{ean}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getItemByEAN");
                        }
                    })


            .add(Methods.GET, "/mindviser/barcodable/1.0.0/api/v1/upc/{upc}", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("getItemByUPC");
                        }
                    })

        ;
        return handler;
    }
}

