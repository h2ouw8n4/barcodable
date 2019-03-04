#![allow(unused_extern_crates)]
extern crate serde_ignored;
extern crate tokio_core;
extern crate native_tls;
extern crate hyper_tls;
extern crate openssl;
extern crate mime;
extern crate uuid;
extern crate chrono;
extern crate percent_encoding;
extern crate url;


use std::sync::Arc;
use std::marker::PhantomData;
use futures::{Future, future, Stream, stream};
use hyper;
use hyper::{Request, Response, Error, StatusCode};
use hyper::header::{Headers, ContentType};
use self::url::form_urlencoded;
use mimetypes;

use serde_json;


#[allow(unused_imports)]
use std::collections::{HashMap, BTreeMap};
#[allow(unused_imports)]
use swagger;
use std::io;

#[allow(unused_imports)]
use std::collections::BTreeSet;

pub use swagger::auth::Authorization;
use swagger::{ApiError, XSpanId, XSpanIdString, Has, RequestParser};
use swagger::auth::Scopes;

use {Api,
     ConvertCodeResponse,
     GetItemByASINResponse,
     GetItemByEANResponse,
     GetItemByUPCResponse
     };
#[allow(unused_imports)]
use models;

pub mod context;

header! { (Warning, "Warning") => [String] }

mod paths {
    extern crate regex;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(&[
            r"^/magicCashew/barcodable/1.0.0/api/v1/asin/(?P<asin>[^/?#]*)$",
            r"^/magicCashew/barcodable/1.0.0/api/v1/convert/(?P<upc | ean | asin>[^/?#]*)$",
            r"^/magicCashew/barcodable/1.0.0/api/v1/ean/(?P<ean>[^/?#]*)$",
            r"^/magicCashew/barcodable/1.0.0/api/v1/upc/(?P<upc>[^/?#]*)$"
        ]).unwrap();
    }
    pub static ID_API_V1_ASIN_ASIN: usize = 0;
    lazy_static! {
        pub static ref REGEX_API_V1_ASIN_ASIN: regex::Regex = regex::Regex::new(r"^/magicCashew/barcodable/1.0.0/api/v1/asin/(?P<asin>[^/?#]*)$").unwrap();
    }
    pub static ID_API_V1_CONVERT_UPC___EAN___ASIN: usize = 1;
    lazy_static! {
        pub static ref REGEX_API_V1_CONVERT_UPC___EAN___ASIN: regex::Regex = regex::Regex::new(r"^/magicCashew/barcodable/1.0.0/api/v1/convert/(?P<upc | ean | asin>[^/?#]*)$").unwrap();
    }
    pub static ID_API_V1_EAN_EAN: usize = 2;
    lazy_static! {
        pub static ref REGEX_API_V1_EAN_EAN: regex::Regex = regex::Regex::new(r"^/magicCashew/barcodable/1.0.0/api/v1/ean/(?P<ean>[^/?#]*)$").unwrap();
    }
    pub static ID_API_V1_UPC_UPC: usize = 3;
    lazy_static! {
        pub static ref REGEX_API_V1_UPC_UPC: regex::Regex = regex::Regex::new(r"^/magicCashew/barcodable/1.0.0/api/v1/upc/(?P<upc>[^/?#]*)$").unwrap();
    }
}

pub struct NewService<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static
{
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> NewService<T, C> {
        NewService{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::NewService for NewService<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Instance = Service<T, C>;

    fn new_service(&self) -> Result<Self::Instance, io::Error> {
        Ok(Service::new(self.api_impl.clone()))
    }
}

pub struct Service<T, C> {
    api_impl: Arc<T>,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static {
    pub fn new<U: Into<Arc<T>>>(api_impl: U) -> Service<T, C> {
        Service{api_impl: api_impl.into(), marker: PhantomData}
    }
}

impl<T, C> hyper::server::Service for Service<T, C>
where
    T: Api<C> + Clone + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + 'static
{
    type Request = (Request, C);
    type Response = Response;
    type Error = Error;
    type Future = Box<Future<Item=Response, Error=Error>>;

    fn call(&self, (req, mut context): Self::Request) -> Self::Future {
        let api_impl = self.api_impl.clone();
        let (method, uri, _, headers, body) = req.deconstruct();
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        // This match statement is duplicated below in `parse_operation_id()`.
        // Please update both places if changing how this code is autogenerated.
        match &method {

            // ConvertCode - GET /api/v1/convert/{upc | ean | asin}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_CONVERT_UPC___EAN___ASIN) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_V1_CONVERT_UPC___EAN___ASIN
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V1_CONVERT_UPC___EAN___ASIN in set but failed match against \"{}\"", path, paths::REGEX_API_V1_CONVERT_UPC___EAN___ASIN.as_str())
                    );

                let param_upc___ean___asin = match percent_encoding::percent_decode(path_params["upc | ean | asin"].as_bytes()).decode_utf8() {
                    Ok(param_upc___ean___asin) => match param_upc___ean___asin.parse::<String>() {
                        Ok(param_upc___ean___asin) => param_upc___ean___asin,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter upc | ean | asin: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["upc | ean | asin"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.convert_code(param_upc___ean___asin, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ConvertCodeResponse::SuccessfulOperation

                                                    {
                                                        body,
                                                        x_valid_authorization, 

                                                        x_rate_limit_limit, 

                                                        x_rate_limit_remaining, 

                                                        x_rate_limit_reset
                                                    }


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());
                                                    header! { (ResponseXValidAuthorization, "X-ValidAuthorization") => [bool] }
                                                    response.headers_mut().set(ResponseXValidAuthorization(x_valid_authorization));
                                                    header! { (ResponseXRateLimitLimit, "X-RateLimit-Limit") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitLimit(x_rate_limit_limit));
                                                    header! { (ResponseXRateLimitRemaining, "X-RateLimit-Remaining") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitRemaining(x_rate_limit_remaining));
                                                    header! { (ResponseXRateLimitReset, "X-RateLimit-Reset") => [chrono::DateTime<chrono::Utc>] }
                                                    response.headers_mut().set(ResponseXRateLimitReset(x_rate_limit_reset));

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CONVERT_CODE_SUCCESSFUL_OPERATION.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                ConvertCodeResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::CONVERT_CODE_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetItemByASIN - GET /api/v1/asin/{asin}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_ASIN_ASIN) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_V1_ASIN_ASIN
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V1_ASIN_ASIN in set but failed match against \"{}\"", path, paths::REGEX_API_V1_ASIN_ASIN.as_str())
                    );

                let param_asin = match percent_encoding::percent_decode(path_params["asin"].as_bytes()).decode_utf8() {
                    Ok(param_asin) => match param_asin.parse::<String>() {
                        Ok(param_asin) => param_asin,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter asin: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["asin"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_item_by_asin(param_asin, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetItemByASINResponse::SuccessfulOperation

                                                    {
                                                        body,
                                                        x_valid_authorization, 

                                                        x_rate_limit_limit, 

                                                        x_rate_limit_remaining, 

                                                        x_rate_limit_reset
                                                    }


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());
                                                    header! { (ResponseXValidAuthorization, "X-ValidAuthorization") => [bool] }
                                                    response.headers_mut().set(ResponseXValidAuthorization(x_valid_authorization));
                                                    header! { (ResponseXRateLimitLimit, "X-RateLimit-Limit") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitLimit(x_rate_limit_limit));
                                                    header! { (ResponseXRateLimitRemaining, "X-RateLimit-Remaining") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitRemaining(x_rate_limit_remaining));
                                                    header! { (ResponseXRateLimitReset, "X-RateLimit-Reset") => [chrono::DateTime<chrono::Utc>] }
                                                    response.headers_mut().set(ResponseXRateLimitReset(x_rate_limit_reset));

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_ASIN_SUCCESSFUL_OPERATION.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetItemByASINResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_ASIN_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetItemByASINResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_ASIN_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetItemByEAN - GET /api/v1/ean/{ean}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_EAN_EAN) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_V1_EAN_EAN
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V1_EAN_EAN in set but failed match against \"{}\"", path, paths::REGEX_API_V1_EAN_EAN.as_str())
                    );

                let param_ean = match percent_encoding::percent_decode(path_params["ean"].as_bytes()).decode_utf8() {
                    Ok(param_ean) => match param_ean.parse::<String>() {
                        Ok(param_ean) => param_ean,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter ean: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ean"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_item_by_ean(param_ean, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetItemByEANResponse::SuccessfulOperation

                                                    {
                                                        body,
                                                        x_valid_authorization, 

                                                        x_rate_limit_limit, 

                                                        x_rate_limit_remaining, 

                                                        x_rate_limit_reset
                                                    }


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());
                                                    header! { (ResponseXValidAuthorization, "X-ValidAuthorization") => [bool] }
                                                    response.headers_mut().set(ResponseXValidAuthorization(x_valid_authorization));
                                                    header! { (ResponseXRateLimitLimit, "X-RateLimit-Limit") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitLimit(x_rate_limit_limit));
                                                    header! { (ResponseXRateLimitRemaining, "X-RateLimit-Remaining") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitRemaining(x_rate_limit_remaining));
                                                    header! { (ResponseXRateLimitReset, "X-RateLimit-Reset") => [chrono::DateTime<chrono::Utc>] }
                                                    response.headers_mut().set(ResponseXRateLimitReset(x_rate_limit_reset));

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_EAN_SUCCESSFUL_OPERATION.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetItemByEANResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_EAN_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetItemByEANResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_EAN_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            // GetItemByUPC - GET /api/v1/upc/{upc}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_UPC_UPC) => {


                // Path parameters
                let path = uri.path().to_string();
                let path_params =
                    paths::REGEX_API_V1_UPC_UPC
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_V1_UPC_UPC in set but failed match against \"{}\"", path, paths::REGEX_API_V1_UPC_UPC.as_str())
                    );

                let param_upc = match percent_encoding::percent_decode(path_params["upc"].as_bytes()).decode_utf8() {
                    Ok(param_upc) => match param_upc.parse::<String>() {
                        Ok(param_upc) => param_upc,
                        Err(e) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't parse path parameter upc: {}", e)))),
                    },
                    Err(_) => return Box::new(future::ok(Response::new().with_status(StatusCode::BadRequest).with_body(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["upc"]))))
                };





                Box::new({
                        {{

                                Box::new(api_impl.get_item_by_upc(param_upc, &context)
                                    .then(move |result| {
                                        let mut response = Response::new();
                                        response.headers_mut().set(XSpanId((&context as &Has<XSpanIdString>).get().0.to_string()));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetItemByUPCResponse::SuccessfulOperation

                                                    {
                                                        body,
                                                        x_valid_authorization, 

                                                        x_rate_limit_limit, 

                                                        x_rate_limit_remaining, 

                                                        x_rate_limit_reset
                                                    }


                                                => {
                                                    response.set_status(StatusCode::try_from(200).unwrap());
                                                    header! { (ResponseXValidAuthorization, "X-ValidAuthorization") => [bool] }
                                                    response.headers_mut().set(ResponseXValidAuthorization(x_valid_authorization));
                                                    header! { (ResponseXRateLimitLimit, "X-RateLimit-Limit") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitLimit(x_rate_limit_limit));
                                                    header! { (ResponseXRateLimitRemaining, "X-RateLimit-Remaining") => [i32] }
                                                    response.headers_mut().set(ResponseXRateLimitRemaining(x_rate_limit_remaining));
                                                    header! { (ResponseXRateLimitReset, "X-RateLimit-Reset") => [chrono::DateTime<chrono::Utc>] }
                                                    response.headers_mut().set(ResponseXRateLimitReset(x_rate_limit_reset));

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_UPC_SUCCESSFUL_OPERATION.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetItemByUPCResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(400).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_UPC_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                                GetItemByUPCResponse::SearchResultsMatchingCriteria

                                                    (body)


                                                => {
                                                    response.set_status(StatusCode::try_from(404).unwrap());

                                                    response.headers_mut().set(ContentType(mimetypes::responses::GET_ITEM_BY_UPC_SEARCH_RESULTS_MATCHING_CRITERIA.clone()));


                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");

                                                    response.set_body(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.set_status(StatusCode::InternalServerError);
                                                response.set_body("An internal error occurred");
                                            },
                                        }

                                        future::ok(response)
                                    }
                                ))

                        }}
                }) as Box<Future<Item=Response, Error=Error>>


            },


            _ => Box::new(future::ok(Response::new().with_status(StatusCode::NotFound))) as Box<Future<Item=Response, Error=Error>>,
        }
    }
}

impl<T, C> Clone for Service<T, C>
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl RequestParser for ApiRequestParser {
    fn parse_operation_id(request: &Request) -> Result<&'static str, ()> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match request.method() {

            // ConvertCode - GET /api/v1/convert/{upc | ean | asin}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_CONVERT_UPC___EAN___ASIN) => Ok("ConvertCode"),

            // GetItemByASIN - GET /api/v1/asin/{asin}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_ASIN_ASIN) => Ok("GetItemByASIN"),

            // GetItemByEAN - GET /api/v1/ean/{ean}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_EAN_EAN) => Ok("GetItemByEAN"),

            // GetItemByUPC - GET /api/v1/upc/{upc}
            &hyper::Method::Get if path.matched(paths::ID_API_V1_UPC_UPC) => Ok("GetItemByUPC"),
            _ => Err(()),
        }
    }
}
