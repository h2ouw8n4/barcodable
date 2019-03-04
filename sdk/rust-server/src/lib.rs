#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
extern crate serde;
#[macro_use]
extern crate serde_derive;
extern crate serde_json;


extern crate futures;
extern crate chrono;
#[macro_use]
extern crate lazy_static;
#[macro_use]
extern crate log;

// Logically this should be in the client and server modules, but rust doesn't allow `macro_use` from a module.
#[cfg(any(feature = "client", feature = "server"))]
#[macro_use]
extern crate hyper;

extern crate swagger;

#[macro_use]
extern crate url;

use futures::Stream;
use std::io::Error;

#[allow(unused_imports)]
use std::collections::HashMap;

pub use futures::Future;

#[cfg(any(feature = "client", feature = "server"))]
mod mimetypes;

pub use swagger::{ApiError, ContextWrapper};

pub const BASE_PATH: &'static str = "/mindviser/barcodable/1.0.0";
pub const API_VERSION: &'static str = "1.5.0";


#[derive(Debug, PartialEq)]
pub enum ConvertCodeResponse {
    /// successful operation
    SuccessfulOperation { body: models::InlineResponse200, x_valid_authorization: bool, x_rate_limit_limit: i32, x_rate_limit_remaining: i32, x_rate_limit_reset: chrono::DateTime<chrono::Utc> } ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::InlineResponse400 ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetItemByASINResponse {
    /// successful operation
    SuccessfulOperation { body: models::Item, x_valid_authorization: bool, x_rate_limit_limit: i32, x_rate_limit_remaining: i32, x_rate_limit_reset: chrono::DateTime<chrono::Utc> } ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::InvalidCode ) ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::NotFound ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetItemByEANResponse {
    /// successful operation
    SuccessfulOperation { body: models::Item, x_valid_authorization: bool, x_rate_limit_limit: i32, x_rate_limit_remaining: i32, x_rate_limit_reset: chrono::DateTime<chrono::Utc> } ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::InvalidCode ) ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::NotFound ) ,
}

#[derive(Debug, PartialEq)]
pub enum GetItemByUPCResponse {
    /// successful operation
    SuccessfulOperation { body: models::Item, x_valid_authorization: bool, x_rate_limit_limit: i32, x_rate_limit_remaining: i32, x_rate_limit_reset: chrono::DateTime<chrono::Utc> } ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::InvalidCode ) ,
    /// search results matching criteria
    SearchResultsMatchingCriteria ( models::NotFound ) ,
}


/// API
pub trait Api<C> {

    /// Convert between UPC, EAN, and ASIN product codes.
    fn convert_code(&self, upc___ean___asin: String, context: &C) -> Box<Future<Item=ConvertCodeResponse, Error=ApiError>>;

    /// Find item by asin code
    fn get_item_by_asin(&self, asin: String, context: &C) -> Box<Future<Item=GetItemByASINResponse, Error=ApiError>>;

    /// Find item by UPC code
    fn get_item_by_ean(&self, ean: String, context: &C) -> Box<Future<Item=GetItemByEANResponse, Error=ApiError>>;

    /// Find item by UPC code
    fn get_item_by_upc(&self, upc: String, context: &C) -> Box<Future<Item=GetItemByUPCResponse, Error=ApiError>>;

}

/// API without a `Context`
pub trait ApiNoContext {

    /// Convert between UPC, EAN, and ASIN product codes.
    fn convert_code(&self, upc___ean___asin: String) -> Box<Future<Item=ConvertCodeResponse, Error=ApiError>>;

    /// Find item by asin code
    fn get_item_by_asin(&self, asin: String) -> Box<Future<Item=GetItemByASINResponse, Error=ApiError>>;

    /// Find item by UPC code
    fn get_item_by_ean(&self, ean: String) -> Box<Future<Item=GetItemByEANResponse, Error=ApiError>>;

    /// Find item by UPC code
    fn get_item_by_upc(&self, upc: String) -> Box<Future<Item=GetItemByUPCResponse, Error=ApiError>>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<'a, C> where Self: Sized {
    /// Binds this API to a context.
    fn with_context(self: &'a Self, context: C) -> ContextWrapper<'a, Self, C>;
}

impl<'a, T: Api<C> + Sized, C> ContextWrapperExt<'a, C> for T {
    fn with_context(self: &'a T, context: C) -> ContextWrapper<'a, T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

impl<'a, T: Api<C>, C> ApiNoContext for ContextWrapper<'a, T, C> {

    /// Convert between UPC, EAN, and ASIN product codes.
    fn convert_code(&self, upc___ean___asin: String) -> Box<Future<Item=ConvertCodeResponse, Error=ApiError>> {
        self.api().convert_code(upc___ean___asin, &self.context())
    }

    /// Find item by asin code
    fn get_item_by_asin(&self, asin: String) -> Box<Future<Item=GetItemByASINResponse, Error=ApiError>> {
        self.api().get_item_by_asin(asin, &self.context())
    }

    /// Find item by UPC code
    fn get_item_by_ean(&self, ean: String) -> Box<Future<Item=GetItemByEANResponse, Error=ApiError>> {
        self.api().get_item_by_ean(ean, &self.context())
    }

    /// Find item by UPC code
    fn get_item_by_upc(&self, upc: String) -> Box<Future<Item=GetItemByUPCResponse, Error=ApiError>> {
        self.api().get_item_by_upc(upc, &self.context())
    }

}

#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use self::client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

pub mod models;
