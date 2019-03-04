(ns barcodable/com-api.api.product-lookup
  (:require [barcodable/com-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [barcodable/com-api.specs.not-found :refer :all]
            [barcodable/com-api.specs.item :refer :all]
            [barcodable/com-api.specs.invalid-code :refer :all]
            [barcodable/com-api.specs.inline-response-400 :refer :all]
            [barcodable/com-api.specs.inline-response-200 :refer :all]
            )
  (:import (java.io File)))


(defn-spec get-item-by-asin-with-http-info any?
  "Find item by asin code
  Returns a single item"
  [asin string?]
  (check-required-params asin)
  (call-api "/api/v1/asin/{asin}" :get
            {:path-params   {"asin" asin }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-item-by-asin item-spec
  "Find item by asin code
  Returns a single item"
  [asin string?]
  (let [res (:data (get-item-by-asin-with-http-info asin))]
    (if (:decode-models *api-context*)
       (st/decode item-spec res st/string-transformer)
       res)))


(defn-spec get-item-by-ean-with-http-info any?
  "Find item by UPC code
  Returns a single item"
  [ean string?]
  (check-required-params ean)
  (call-api "/api/v1/ean/{ean}" :get
            {:path-params   {"ean" ean }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-item-by-ean item-spec
  "Find item by UPC code
  Returns a single item"
  [ean string?]
  (let [res (:data (get-item-by-ean-with-http-info ean))]
    (if (:decode-models *api-context*)
       (st/decode item-spec res st/string-transformer)
       res)))


(defn-spec get-item-by-upc-with-http-info any?
  "Find item by UPC code
  Returns a single item"
  [upc string?]
  (check-required-params upc)
  (call-api "/api/v1/upc/{upc}" :get
            {:path-params   {"upc" upc }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-item-by-upc item-spec
  "Find item by UPC code
  Returns a single item"
  [upc string?]
  (let [res (:data (get-item-by-upc-with-http-info upc))]
    (if (:decode-models *api-context*)
       (st/decode item-spec res st/string-transformer)
       res)))


