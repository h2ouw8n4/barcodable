#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse200 {
    /// A list of UPCs
    #[serde(rename = "upcs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub upcs: Option<Vec<String>>,

    /// A list of EANs
    #[serde(rename = "eans")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eans: Option<Vec<String>>,

    /// A list of ASINs
    #[serde(rename = "asins")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asins: Option<Vec<String>>,

    #[serde(rename = "message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message: Option<String>,

}

impl InlineResponse200 {
    pub fn new() -> InlineResponse200 {
        InlineResponse200 {
            upcs: None,
            eans: None,
            asins: None,
            message: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse400 {
    #[serde(rename = "message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message: Option<String>,

    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<i32>,

}

impl InlineResponse400 {
    pub fn new() -> InlineResponse400 {
        InlineResponse400 {
            message: None,
            status: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InvalidCode {
    #[serde(rename = "message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message: Option<String>,

    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<i32>,

}

impl InvalidCode {
    pub fn new() -> InvalidCode {
        InvalidCode {
            message: None,
            status: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Item {
    #[serde(rename = "upc")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub upc: Option<String>,

    #[serde(rename = "ean")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ean: Option<String>,

    #[serde(rename = "isbn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub isbn: Option<String>,

    #[serde(rename = "asin")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub asin: Option<String>,

    #[serde(rename = "title")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub title: Option<String>,

    #[serde(rename = "sku")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sku: Option<String>,

    #[serde(rename = "mpn")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub mpn: Option<String>,

    #[serde(rename = "part_number")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub part_number: Option<String>,

    /// A list of matching upc codes.
    #[serde(rename = "upcs")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub upcs: Option<Vec<String>>,

    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    #[serde(rename = "brand")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub brand: Option<String>,

    #[serde(rename = "manufacturer")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub manufacturer: Option<String>,

    #[serde(rename = "color")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub color: Option<String>,

    #[serde(rename = "new_price")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub new_price: Option<f64>,

    #[serde(rename = "used_price")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub used_price: Option<f64>,

    #[serde(rename = "currency_code")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub currency_code: Option<String>,

    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url: Option<String>,

    /// A list of product feature descriptions.
    #[serde(rename = "features")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub features: Option<Vec<String>>,

    /// Product dimensions and weight.  ('meters', 'centimeters', 'millimeters', 'inches', 'feet', 'yards', 'ounces', 'pounds', 'grams', 'milligrams', 'kilograms')
    #[serde(rename = "dimensions")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dimensions: Option<Vec<object>>,

    /// A list product images.
    #[serde(rename = "images")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub images: Option<Vec<String>>,

    /// Matched items for this product.
    #[serde(rename = "matched_items")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub matched_items: Option<Vec<object>>,

    /// A list of country codes from which this item belongs.
    #[serde(rename = "iso_country_codes")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub iso_country_codes: Option<Vec<String>>,

    /// The company name registered to the product's UPC or EAN.
    #[serde(rename = "company_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub company_name: Option<String>,

    /// The company address registered to the product's UPC or EAN.
    #[serde(rename = "company_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub company_address: Option<String>,

    /// A list of categories for this product.
    #[serde(rename = "categories")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub categories: Option<Vec<String>>,

    /// A list of category hierarchies for this product. Categories are listed in order of generic category to most specific category.
    #[serde(rename = "category_hierarchies")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub category_hierarchies: Option<Vec<String>>,

}

impl Item {
    pub fn new() -> Item {
        Item {
            upc: None,
            ean: None,
            isbn: None,
            asin: None,
            title: None,
            sku: None,
            mpn: None,
            part_number: None,
            upcs: None,
            description: None,
            brand: None,
            manufacturer: None,
            color: None,
            new_price: None,
            used_price: None,
            currency_code: None,
            url: None,
            features: None,
            dimensions: None,
            images: None,
            matched_items: None,
            iso_country_codes: None,
            company_name: None,
            company_address: None,
            categories: None,
            category_hierarchies: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct NotFound {
    #[serde(rename = "message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message: Option<String>,

    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<i32>,

}

impl NotFound {
    pub fn new() -> NotFound {
        NotFound {
            message: None,
            status: None,
        }
    }
}
