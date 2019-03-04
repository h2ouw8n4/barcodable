(ns barcodable/com-api.specs.item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-data
  {
   (ds/opt :upc) string?
   (ds/opt :ean) string?
   (ds/opt :isbn) string?
   (ds/opt :asin) string?
   (ds/opt :title) string?
   (ds/opt :sku) string?
   (ds/opt :mpn) string?
   (ds/opt :part_number) string?
   (ds/opt :upcs) (s/coll-of string?)
   (ds/opt :description) string?
   (ds/opt :brand) string?
   (ds/opt :manufacturer) string?
   (ds/opt :color) string?
   (ds/opt :new_price) float?
   (ds/opt :used_price) float?
   (ds/opt :currency_code) string?
   (ds/opt :url) string?
   (ds/opt :features) (s/coll-of string?)
   (ds/opt :dimensions) (s/coll-of any?)
   (ds/opt :images) (s/coll-of string?)
   (ds/opt :matched_items) (s/coll-of any?)
   (ds/opt :iso_country_codes) (s/coll-of string?)
   (ds/opt :company_name) string?
   (ds/opt :company_address) string?
   (ds/opt :categories) (s/coll-of string?)
   (ds/opt :category_hierarchies) (s/coll-of string?)
   })

(def item-spec
  (ds/spec
    {:name ::item
     :spec item-data}))
