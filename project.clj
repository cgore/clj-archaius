(defproject clj-archaius "0.2.0"
  :description "A Clojure library designed to use Netflix/archaius for configuration management."
  :url "https://github.com/leancloud/clj-archaius"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.netflix.archaius/archaius-core "0.7.4"]]
  :profiles {:dev {:resource-paths ["dev"]}})
