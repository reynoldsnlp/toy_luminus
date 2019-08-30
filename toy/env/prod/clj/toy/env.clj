(ns toy.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[toy started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[toy has shut down successfully]=-"))
   :middleware identity})
