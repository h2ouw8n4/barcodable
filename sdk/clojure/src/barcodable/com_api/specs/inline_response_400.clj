(ns barcodable/com-api.specs.inline-response-400
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inline-response-400-data
  {
   (ds/opt :message) string?
   (ds/opt :status) int?
   })

(def inline-response-400-spec
  (ds/spec
    {:name ::inline-response-400
     :spec inline-response-400-data}))
