use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  product_conversion_api: Box<::apis::ProductConversionApi>,
  product_lookup_api: Box<::apis::ProductLookupApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      product_conversion_api: Box::new(::apis::ProductConversionApiClient::new(rc.clone())),
      product_lookup_api: Box::new(::apis::ProductLookupApiClient::new(rc.clone())),
    }
  }

  pub fn product_conversion_api(&self) -> &::apis::ProductConversionApi{
    self.product_conversion_api.as_ref()
  }

  pub fn product_lookup_api(&self) -> &::apis::ProductLookupApi{
    self.product_lookup_api.as_ref()
  }


}
