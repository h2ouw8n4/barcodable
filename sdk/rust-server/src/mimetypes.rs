/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit
    /// Create Mime objects for the response content types for ConvertCode
    lazy_static! {
        pub static ref CONVERT_CODE_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for ConvertCode
    lazy_static! {
        pub static ref CONVERT_CODE_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByASIN
    lazy_static! {
        pub static ref GET_ITEM_BY_ASIN_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByASIN
    lazy_static! {
        pub static ref GET_ITEM_BY_ASIN_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByASIN
    lazy_static! {
        pub static ref GET_ITEM_BY_ASIN_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByEAN
    lazy_static! {
        pub static ref GET_ITEM_BY_EAN_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByEAN
    lazy_static! {
        pub static ref GET_ITEM_BY_EAN_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByEAN
    lazy_static! {
        pub static ref GET_ITEM_BY_EAN_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByUPC
    lazy_static! {
        pub static ref GET_ITEM_BY_UPC_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByUPC
    lazy_static! {
        pub static ref GET_ITEM_BY_UPC_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }
    /// Create Mime objects for the response content types for GetItemByUPC
    lazy_static! {
        pub static ref GET_ITEM_BY_UPC_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;

}
