(ns barcodable/com-api.api.product-conversion
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


(defn-spec convert-code-with-http-info any?
  "Convert between UPC, EAN, and ASIN product codes.
  Returns the converted UPC, EAN, and ASIN codes."
  [upceanasin string?]
  (check-required-params upceanasin)
  (call-api "/api/v1/convert/{upc | ean | asin}" :get
            {:path-params   {"upc | ean | asin" upceanasin }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec convert-code inline-response-200-spec
  "Convert between UPC, EAN, and ASIN product codes.
  Returns the converted UPC, EAN, and ASIN codes."
  [upceanasin string?]
  (let [res (:data (convert-code-with-http-info upceanasin))]
    (if (:decode-models *api-context*)
       (st/decode inline-response-200-spec res st/string-transformer)
       res)))


