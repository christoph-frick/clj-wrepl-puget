(defproject net.ofnir/wrepl.puget "0.1.2-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [mvxcvi/puget "1.3.2"]
                 [integrant "0.8.0"]]
  :deploy-repositories {"releases" {:url "https://clojars.org/repo/" :creds :gpg}})
