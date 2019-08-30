(ns toy.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [toy.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[toy started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[toy has shut down successfully]=-"))
   :middleware wrap-dev})
