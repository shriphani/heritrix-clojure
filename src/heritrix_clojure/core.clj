(ns heritrix-clojure.core
  "Clojure implementation of the Heritrix REST API"
  (:require [clj-http.client :as client]))

(defn create
  [heritrix-addr createpath username password]
  (client/post heritrix-addr
               {:form-params {:action "create"
                              :createpath createpath}
                :digest-auth [username password]

                :insecure? true}))

(defn add
  [heritrix-addr addpath username password]
  (client/post heritrix-addr
               {:form-params {:action "add"
                              :addpath addpath}
                :digest-auth [username password]

                :insecure? true}))

(defn build
  [heritrix-job-addr username password]
  (client/post heritrix-job-addr
               {:form-params {:action "build"}
                :digest-auth [username password]

                :insecure? true}))

(defn launch
  [heritrix-job-addr username password]
  (client/post heritrix-job-addr
               {:form-params {:action "launch"}
                :digest-auth [username password]

                :insecure? true}))

(defn pause
  [heritrix-job-addr username password]
  (client/post heritrix-job-addr
               {:form-params {:action "pause"}
                :digest-auth [username password]

                :insecure? true}))

(defn unpause
  [heritrix-job-addr username password]
  (client/post heritrix-job-addr
               {:form-params {:action "unpause"}
                :digest-auth [username password]

                :insecure? true}))

(defn terminate
  [heritrix-job-addr username password]
  (client/post heritrix-job-addr
               {:form-params {:action "terminate"}
                :digest-auth [username password]

                :insecure? true}))

(defn teardown
  [heritrix-job-addr username password]
  (client/post heritrix-job-addr
               {:form-params {:action "teardown"}
                :digest-auth [username password]

                :insecure? true}))
