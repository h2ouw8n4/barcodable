(ns barcodable/com-api.specs.inline-response-200
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-response-200-data
  {
   (ds/opt :upcs) (s/coll-of string?)
   (ds/opt :eans) (s/coll-of string?)
   (ds/opt :asins) (s/coll-of string?)
   (ds/opt :message) string?
   })

(def inline-response-200-spec
  (ds/spec
    {:name ::inline-response-200
     :spec inline-response-200-data}))
