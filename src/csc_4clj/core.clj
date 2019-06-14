(ns csc-4clj.core
  "Functions used to fetch 4clojure problems and write them as clj files."
  (:require
   [clojure.java.io :as io]
   [clostache.parser :refer [render render-resource]]
   [clojure.string :as str]
   [cheshire.core :as json]
   [clj-http.client :as http]))

(def problem-url-fmt "http://4clojure.com/api/problem/%d")

(defn fetch-problem
  [problem-id]
  (let [request (http/get (format problem-url-fmt problem-id))]
    (when (= 200 (:status request))
      (-> request
          :body
          (json/parse-string true)
          (select-keys [:description :tags :difficulty :tests :title :restricted])
          (assoc :id problem-id)))))


(defn load-problem-ids []
  (-> "problem-listing.edn"
      io/resource
      slurp
      clojure.edn/read-string))


(defn remove-carriage-return
  [s]
  (str/replace s "\r" ""))


(defn problem->clj-string
  [problem]
  (let [problem      (-> problem
                         (update :tags #(str/join ", " %))
                         (update :description (comp remove-carriage-return #(str/replace % "\n" "\n;;")))
                         (update :tests #(map remove-carriage-return %)))
        restrictions (when-let [restricted (seq (:restricted problem))]
                       {:restricted (format
                                      ";;\n;; Special restrictions: %s\n" (str/join ", " restricted))})]
    (render-resource
      "problem-template.mustache"
      problem
      restrictions)))


(defn create-problem-files
  [problem-ids problems-output-dir]
  (doseq [id problem-ids]
    (when-let [{:keys [id difficulty] :as problem} (fetch-problem id)]
      (let [code       (problem->clj-string problem)
            difficulty (str/lower-case difficulty)
            filename   (format "%s/%s/p%d.clj" problems-output-dir difficulty id)]
        (spit filename code)))))
