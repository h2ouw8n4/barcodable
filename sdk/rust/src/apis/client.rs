use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient {
    product_conversion_api: Box<dyn crate::apis::ProductConversionApi>,
    product_lookup_api: Box<dyn crate::apis::ProductLookupApi>,
}

impl APIClient {
    pub fn new<C: hyper::client::Connect>(configuration: Configuration<C>) -> APIClient {
        let rc = Rc::new(configuration);

        APIClient {
            product_conversion_api: Box::new(crate::apis::ProductConversionApiClient::new(rc.clone())),
            product_lookup_api: Box::new(crate::apis::ProductLookupApiClient::new(rc.clone())),
        }
    }

    pub fn product_conversion_api(&self) -> &dyn crate::apis::ProductConversionApi{
        self.product_conversion_api.as_ref()
    }

    pub fn product_lookup_api(&self) -> &dyn crate::apis::ProductLookupApi{
        self.product_lookup_api.as_ref()
    }

}
