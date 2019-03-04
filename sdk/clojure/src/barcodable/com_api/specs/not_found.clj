(ns barcodable/com-api.specs.not-found
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def not-found-data
  {
   (ds/opt :message) string?
   (ds/opt :status) int?
   })

(def not-found-spec
  (ds/spec
    {:name ::not-found
     :spec not-found-data}))
