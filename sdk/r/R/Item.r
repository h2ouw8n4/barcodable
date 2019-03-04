# Barcodable.com API
#
# Barcodable.com API
#
# OpenAPI spec version: 1.5.0
# Contact: support@barcodable.com
# Generated by: https://openapi-generator.tech


#' Item Class
#'
#' @field upc 
#' @field ean 
#' @field isbn 
#' @field asin 
#' @field title 
#' @field sku 
#' @field mpn 
#' @field part_number 
#' @field upcs 
#' @field description 
#' @field brand 
#' @field manufacturer 
#' @field color 
#' @field new_price 
#' @field used_price 
#' @field currency_code 
#' @field url 
#' @field features 
#' @field dimensions 
#' @field images 
#' @field matched_items 
#' @field iso_country_codes 
#' @field company_name 
#' @field company_address 
#' @field categories 
#' @field category_hierarchies 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Item <- R6::R6Class(
  'Item',
  public = list(
    `upc` = NULL,
    `ean` = NULL,
    `isbn` = NULL,
    `asin` = NULL,
    `title` = NULL,
    `sku` = NULL,
    `mpn` = NULL,
    `part_number` = NULL,
    `upcs` = NULL,
    `description` = NULL,
    `brand` = NULL,
    `manufacturer` = NULL,
    `color` = NULL,
    `new_price` = NULL,
    `used_price` = NULL,
    `currency_code` = NULL,
    `url` = NULL,
    `features` = NULL,
    `dimensions` = NULL,
    `images` = NULL,
    `matched_items` = NULL,
    `iso_country_codes` = NULL,
    `company_name` = NULL,
    `company_address` = NULL,
    `categories` = NULL,
    `category_hierarchies` = NULL,
    initialize = function(`upc`, `ean`, `isbn`, `asin`, `title`, `sku`, `mpn`, `part_number`, `upcs`, `description`, `brand`, `manufacturer`, `color`, `new_price`, `used_price`, `currency_code`, `url`, `features`, `dimensions`, `images`, `matched_items`, `iso_country_codes`, `company_name`, `company_address`, `categories`, `category_hierarchies`){
      if (!missing(`upc`)) {
                stopifnot(is.character(`upc`), length(`upc`) == 1)
        self$`upc` <- `upc`
      }
      if (!missing(`ean`)) {
                stopifnot(is.character(`ean`), length(`ean`) == 1)
        self$`ean` <- `ean`
      }
      if (!missing(`isbn`)) {
                stopifnot(is.character(`isbn`), length(`isbn`) == 1)
        self$`isbn` <- `isbn`
      }
      if (!missing(`asin`)) {
                stopifnot(is.character(`asin`), length(`asin`) == 1)
        self$`asin` <- `asin`
      }
      if (!missing(`title`)) {
                stopifnot(is.character(`title`), length(`title`) == 1)
        self$`title` <- `title`
      }
      if (!missing(`sku`)) {
                stopifnot(is.character(`sku`), length(`sku`) == 1)
        self$`sku` <- `sku`
      }
      if (!missing(`mpn`)) {
                stopifnot(is.character(`mpn`), length(`mpn`) == 1)
        self$`mpn` <- `mpn`
      }
      if (!missing(`part_number`)) {
                stopifnot(is.character(`part_number`), length(`part_number`) == 1)
        self$`part_number` <- `part_number`
      }
      if (!missing(`upcs`)) {
                stopifnot(is.vector(`upcs`), length(`upcs`) != 0)
                sapply(`upcs`, function(x) stopifnot(is.character(x)))
        self$`upcs` <- `upcs`
      }
      if (!missing(`description`)) {
                stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`brand`)) {
                stopifnot(is.character(`brand`), length(`brand`) == 1)
        self$`brand` <- `brand`
      }
      if (!missing(`manufacturer`)) {
                stopifnot(is.character(`manufacturer`), length(`manufacturer`) == 1)
        self$`manufacturer` <- `manufacturer`
      }
      if (!missing(`color`)) {
                stopifnot(is.character(`color`), length(`color`) == 1)
        self$`color` <- `color`
      }
      if (!missing(`new_price`)) {
                stopifnot(is.numeric(`new_price`), length(`new_price`) == 1)
        self$`new_price` <- `new_price`
      }
      if (!missing(`used_price`)) {
                stopifnot(is.numeric(`used_price`), length(`used_price`) == 1)
        self$`used_price` <- `used_price`
      }
      if (!missing(`currency_code`)) {
                stopifnot(is.character(`currency_code`), length(`currency_code`) == 1)
        self$`currency_code` <- `currency_code`
      }
      if (!missing(`url`)) {
                stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
      if (!missing(`features`)) {
                stopifnot(is.vector(`features`), length(`features`) != 0)
                sapply(`features`, function(x) stopifnot(is.character(x)))
        self$`features` <- `features`
      }
      if (!missing(`dimensions`)) {
                stopifnot(is.vector(`dimensions`), length(`dimensions`) != 0)
                sapply(`dimensions`, function(x) stopifnot(is.character(x)))
        self$`dimensions` <- `dimensions`
      }
      if (!missing(`images`)) {
                stopifnot(is.vector(`images`), length(`images`) != 0)
                sapply(`images`, function(x) stopifnot(is.character(x)))
        self$`images` <- `images`
      }
      if (!missing(`matched_items`)) {
                stopifnot(is.vector(`matched_items`), length(`matched_items`) != 0)
                sapply(`matched_items`, function(x) stopifnot(is.character(x)))
        self$`matched_items` <- `matched_items`
      }
      if (!missing(`iso_country_codes`)) {
                stopifnot(is.vector(`iso_country_codes`), length(`iso_country_codes`) != 0)
                sapply(`iso_country_codes`, function(x) stopifnot(is.character(x)))
        self$`iso_country_codes` <- `iso_country_codes`
      }
      if (!missing(`company_name`)) {
                stopifnot(is.character(`company_name`), length(`company_name`) == 1)
        self$`company_name` <- `company_name`
      }
      if (!missing(`company_address`)) {
                stopifnot(is.character(`company_address`), length(`company_address`) == 1)
        self$`company_address` <- `company_address`
      }
      if (!missing(`categories`)) {
                stopifnot(is.vector(`categories`), length(`categories`) != 0)
                sapply(`categories`, function(x) stopifnot(is.character(x)))
        self$`categories` <- `categories`
      }
      if (!missing(`category_hierarchies`)) {
                stopifnot(is.vector(`category_hierarchies`), length(`category_hierarchies`) != 0)
                sapply(`category_hierarchies`, function(x) stopifnot(is.character(x)))
        self$`category_hierarchies` <- `category_hierarchies`
      }
    },
    toJSON = function() {
      ItemObject <- list()
      if (!is.null(self$`upc`)) {
        ItemObject[['upc']] <-
                self$`upc`
      }
      if (!is.null(self$`ean`)) {
        ItemObject[['ean']] <-
                self$`ean`
      }
      if (!is.null(self$`isbn`)) {
        ItemObject[['isbn']] <-
                self$`isbn`
      }
      if (!is.null(self$`asin`)) {
        ItemObject[['asin']] <-
                self$`asin`
      }
      if (!is.null(self$`title`)) {
        ItemObject[['title']] <-
                self$`title`
      }
      if (!is.null(self$`sku`)) {
        ItemObject[['sku']] <-
                self$`sku`
      }
      if (!is.null(self$`mpn`)) {
        ItemObject[['mpn']] <-
                self$`mpn`
      }
      if (!is.null(self$`part_number`)) {
        ItemObject[['part_number']] <-
                self$`part_number`
      }
      if (!is.null(self$`upcs`)) {
        ItemObject[['upcs']] <-
                self$`upcs`
      }
      if (!is.null(self$`description`)) {
        ItemObject[['description']] <-
                self$`description`
      }
      if (!is.null(self$`brand`)) {
        ItemObject[['brand']] <-
                self$`brand`
      }
      if (!is.null(self$`manufacturer`)) {
        ItemObject[['manufacturer']] <-
                self$`manufacturer`
      }
      if (!is.null(self$`color`)) {
        ItemObject[['color']] <-
                self$`color`
      }
      if (!is.null(self$`new_price`)) {
        ItemObject[['new_price']] <-
                self$`new_price`
      }
      if (!is.null(self$`used_price`)) {
        ItemObject[['used_price']] <-
                self$`used_price`
      }
      if (!is.null(self$`currency_code`)) {
        ItemObject[['currency_code']] <-
                self$`currency_code`
      }
      if (!is.null(self$`url`)) {
        ItemObject[['url']] <-
                self$`url`
      }
      if (!is.null(self$`features`)) {
        ItemObject[['features']] <-
                self$`features`
      }
      if (!is.null(self$`dimensions`)) {
        ItemObject[['dimensions']] <-
                self$`dimensions`
      }
      if (!is.null(self$`images`)) {
        ItemObject[['images']] <-
                self$`images`
      }
      if (!is.null(self$`matched_items`)) {
        ItemObject[['matched_items']] <-
                self$`matched_items`
      }
      if (!is.null(self$`iso_country_codes`)) {
        ItemObject[['iso_country_codes']] <-
                self$`iso_country_codes`
      }
      if (!is.null(self$`company_name`)) {
        ItemObject[['company_name']] <-
                self$`company_name`
      }
      if (!is.null(self$`company_address`)) {
        ItemObject[['company_address']] <-
                self$`company_address`
      }
      if (!is.null(self$`categories`)) {
        ItemObject[['categories']] <-
                self$`categories`
      }
      if (!is.null(self$`category_hierarchies`)) {
        ItemObject[['category_hierarchies']] <-
                self$`category_hierarchies`
      }

      ItemObject
    },
    fromJSON = function(ItemJson) {
      ItemObject <- jsonlite::fromJSON(ItemJson)
      if (!is.null(ItemObject$`upc`)) {
                self$`upc` <- ItemObject$`upc`
      }
      if (!is.null(ItemObject$`ean`)) {
                self$`ean` <- ItemObject$`ean`
      }
      if (!is.null(ItemObject$`isbn`)) {
                self$`isbn` <- ItemObject$`isbn`
      }
      if (!is.null(ItemObject$`asin`)) {
                self$`asin` <- ItemObject$`asin`
      }
      if (!is.null(ItemObject$`title`)) {
                self$`title` <- ItemObject$`title`
      }
      if (!is.null(ItemObject$`sku`)) {
                self$`sku` <- ItemObject$`sku`
      }
      if (!is.null(ItemObject$`mpn`)) {
                self$`mpn` <- ItemObject$`mpn`
      }
      if (!is.null(ItemObject$`part_number`)) {
                self$`part_number` <- ItemObject$`part_number`
      }
      if (!is.null(ItemObject$`upcs`)) {
                self$`upcs` <- ItemObject$`upcs`
      }
      if (!is.null(ItemObject$`description`)) {
                self$`description` <- ItemObject$`description`
      }
      if (!is.null(ItemObject$`brand`)) {
                self$`brand` <- ItemObject$`brand`
      }
      if (!is.null(ItemObject$`manufacturer`)) {
                self$`manufacturer` <- ItemObject$`manufacturer`
      }
      if (!is.null(ItemObject$`color`)) {
                self$`color` <- ItemObject$`color`
      }
      if (!is.null(ItemObject$`new_price`)) {
                self$`new_price` <- ItemObject$`new_price`
      }
      if (!is.null(ItemObject$`used_price`)) {
                self$`used_price` <- ItemObject$`used_price`
      }
      if (!is.null(ItemObject$`currency_code`)) {
                self$`currency_code` <- ItemObject$`currency_code`
      }
      if (!is.null(ItemObject$`url`)) {
                self$`url` <- ItemObject$`url`
      }
      if (!is.null(ItemObject$`features`)) {
                self$`features` <- ItemObject$`features`
      }
      if (!is.null(ItemObject$`dimensions`)) {
                self$`dimensions` <- ItemObject$`dimensions`
      }
      if (!is.null(ItemObject$`images`)) {
                self$`images` <- ItemObject$`images`
      }
      if (!is.null(ItemObject$`matched_items`)) {
                self$`matched_items` <- ItemObject$`matched_items`
      }
      if (!is.null(ItemObject$`iso_country_codes`)) {
                self$`iso_country_codes` <- ItemObject$`iso_country_codes`
      }
      if (!is.null(ItemObject$`company_name`)) {
                self$`company_name` <- ItemObject$`company_name`
      }
      if (!is.null(ItemObject$`company_address`)) {
                self$`company_address` <- ItemObject$`company_address`
      }
      if (!is.null(ItemObject$`categories`)) {
                self$`categories` <- ItemObject$`categories`
      }
      if (!is.null(ItemObject$`category_hierarchies`)) {
                self$`category_hierarchies` <- ItemObject$`category_hierarchies`
      }
    },
    toJSONString = function() {
       outstring <- sprintf(
        '{
           "upc":
                      
                      "%s"
                  
              ,
           "ean":
                      
                      "%s"
                  
              ,
           "isbn":
                      
                      "%s"
                  
              ,
           "asin":
                      
                      "%s"
                  
              ,
           "title":
                      
                      "%s"
                  
              ,
           "sku":
                      
                      "%s"
                  
              ,
           "mpn":
                      
                      "%s"
                  
              ,
           "part_number":
                      
                      "%s"
                  
              ,
           "upcs":
                      
                      ["%s"]
                  
              ,
           "description":
                      
                      "%s"
                  
              ,
           "brand":
                      
                      "%s"
                  
              ,
           "manufacturer":
                      
                      "%s"
                  
              ,
           "color":
                      
                      "%s"
                  
              ,
           "new_price":
                      %d
                      
                  
              ,
           "used_price":
                      %d
                      
                  
              ,
           "currency_code":
                      
                      "%s"
                  
              ,
           "url":
                      
                      "%s"
                  
              ,
           "features":
                      
                      ["%s"]
                  
              ,
           "dimensions":
                      
                      ["%s"]
                  
              ,
           "images":
                      
                      ["%s"]
                  
              ,
           "matched_items":
                      
                      ["%s"]
                  
              ,
           "iso_country_codes":
                      
                      ["%s"]
                  
              ,
           "company_name":
                      
                      "%s"
                  
              ,
           "company_address":
                      
                      "%s"
                  
              ,
           "categories":
                      
                      ["%s"]
                  
              ,
           "category_hierarchies":
                      
                      ["%s"]
                  
              
        }',
                self$`upc`,
                self$`ean`,
                self$`isbn`,
                self$`asin`,
                self$`title`,
                self$`sku`,
                self$`mpn`,
                self$`part_number`,
                paste0(self$`upcs`, collapse='","'),
                self$`description`,
                self$`brand`,
                self$`manufacturer`,
                self$`color`,
                self$`new_price`,
                self$`used_price`,
                self$`currency_code`,
                self$`url`,
                paste0(self$`features`, collapse='","'),
                paste0(self$`dimensions`, collapse='","'),
                paste0(self$`images`, collapse='","'),
                paste0(self$`matched_items`, collapse='","'),
                paste0(self$`iso_country_codes`, collapse='","'),
                self$`company_name`,
                self$`company_address`,
                paste0(self$`categories`, collapse='","'),
                paste0(self$`category_hierarchies`, collapse='","')
      )
      gsub("[\r\n]| ", "", outstring)
    },
    fromJSONString = function(ItemJson) {
      ItemObject <- jsonlite::fromJSON(ItemJson)
              self$`upc` <- ItemObject$`upc`
              self$`ean` <- ItemObject$`ean`
              self$`isbn` <- ItemObject$`isbn`
              self$`asin` <- ItemObject$`asin`
              self$`title` <- ItemObject$`title`
              self$`sku` <- ItemObject$`sku`
              self$`mpn` <- ItemObject$`mpn`
              self$`part_number` <- ItemObject$`part_number`
              self$`upcs` <- ItemObject$`upcs`
              self$`description` <- ItemObject$`description`
              self$`brand` <- ItemObject$`brand`
              self$`manufacturer` <- ItemObject$`manufacturer`
              self$`color` <- ItemObject$`color`
              self$`new_price` <- ItemObject$`new_price`
              self$`used_price` <- ItemObject$`used_price`
              self$`currency_code` <- ItemObject$`currency_code`
              self$`url` <- ItemObject$`url`
              self$`features` <- ItemObject$`features`
              self$`dimensions` <- ItemObject$`dimensions`
              self$`images` <- ItemObject$`images`
              self$`matched_items` <- ItemObject$`matched_items`
              self$`iso_country_codes` <- ItemObject$`iso_country_codes`
              self$`company_name` <- ItemObject$`company_name`
              self$`company_address` <- ItemObject$`company_address`
              self$`categories` <- ItemObject$`categories`
              self$`category_hierarchies` <- ItemObject$`category_hierarchies`
    }
  )
)
