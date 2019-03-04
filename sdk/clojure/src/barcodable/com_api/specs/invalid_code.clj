(ns barcodable/com-api.specs.invalid-code
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invalid-code-data
  {
   (ds/opt :message) string?
   (ds/opt :status) int?
   })

(def invalid-code-spec
  (ds/spec
    {:name ::invalid-code
     :spec invalid-code-data}))
