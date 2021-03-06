(defproject ring/ring-core "1.7.1"
  :description "Ring core libraries."
  :url "https://github.com/ring-clojure/ring"
  :scm {:dir ".."}
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-codec "1.1.1"]
                 [commons-io "2.6"]
                 [commons-fileupload "1.3.3"]
                 [crypto-random "1.2.0"]
                 [crypto-equality "1.0.0"]]
  :aliases {"test-all" ["with-profile" "default:+1.8:+1.9" "test"]}
  :profiles
  {:provided {:dependencies [[javax.servlet/servlet-api "2.5"]]}
   :dev {:dependencies [[clj-time "0.14.3"]
                        [javax.servlet/servlet-api "2.5"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
   :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}})
