/// mime types for requests and responses

pub mod responses {
    use hyper::mime::*;

    // The macro is called per-operation to beat the recursion limit

    lazy_static! {
        /// Create Mime objects for the response content types for ConvertCode
        pub static ref CONVERT_CODE_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for ConvertCode
        pub static ref CONVERT_CODE_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByASIN
        pub static ref GET_ITEM_BY_ASIN_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByASIN
        pub static ref GET_ITEM_BY_ASIN_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByASIN
        pub static ref GET_ITEM_BY_ASIN_SEARCH_RESULTS_MATCHING_CRITERIA_2: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByEAN
        pub static ref GET_ITEM_BY_EAN_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByEAN
        pub static ref GET_ITEM_BY_EAN_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByEAN
        pub static ref GET_ITEM_BY_EAN_SEARCH_RESULTS_MATCHING_CRITERIA_2: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByUPC
        pub static ref GET_ITEM_BY_UPC_SUCCESSFUL_OPERATION: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByUPC
        pub static ref GET_ITEM_BY_UPC_SEARCH_RESULTS_MATCHING_CRITERIA: Mime = "application/json".parse().unwrap();
    }

    lazy_static! {
        /// Create Mime objects for the response content types for GetItemByUPC
        pub static ref GET_ITEM_BY_UPC_SEARCH_RESULTS_MATCHING_CRITERIA_2: Mime = "application/json".parse().unwrap();
    }

}

pub mod requests {
    use hyper::mime::*;

}
