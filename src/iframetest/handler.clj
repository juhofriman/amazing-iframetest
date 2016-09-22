(ns iframetest.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.resource :as r]
            [ring.middleware.content-type :as c]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (POST "/form.html"
    [feedback redirect-to]
    (println "Receiving feedback" feedback)
    {:status 301
     :headers {"Location" redirect-to}})
  (route/not-found "Not Found"))

  (def app
    (-> app-routes
        (ring.middleware.params/wrap-params)
        (r/wrap-resource "public")
        (c/wrap-content-type)))
