//! Server implementation of openapi_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use openapi_client::{Api, ApiError,
                      ConvertCodeResponse,
                      GetItemByASINResponse,
                      GetItemByEANResponse,
                      GetItemByUPCResponse
};
use openapi_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{

    /// Convert between UPC, EAN, and ASIN product codes.
    fn convert_code(&self, upc___ean___asin: String, context: &C) -> Box<Future<Item=ConvertCodeResponse, Error=ApiError>> {
        let context = context.clone();
        println!("convert_code(\"{}\") - X-Span-ID: {:?}", upc___ean___asin, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Find item by asin code
    fn get_item_by_asin(&self, asin: String, context: &C) -> Box<Future<Item=GetItemByASINResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_item_by_asin(\"{}\") - X-Span-ID: {:?}", asin, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Find item by UPC code
    fn get_item_by_ean(&self, ean: String, context: &C) -> Box<Future<Item=GetItemByEANResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_item_by_ean(\"{}\") - X-Span-ID: {:?}", ean, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// Find item by UPC code
    fn get_item_by_upc(&self, upc: String, context: &C) -> Box<Future<Item=GetItemByUPCResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_item_by_upc(\"{}\") - X-Span-ID: {:?}", upc, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
