(defproject cc.qbits/async-ring-adapter "1.0.2"
  :description "Ring Netty adapter"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [io.netty/netty "3.5.11.Final"]]

  :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]]}
             :dev  {:dependencies [[swank-clojure "1.4.0"]
                                   [clj-http "0.1.3"]
                                   [org.clojure/tools.cli "0.2.1"]
                                   [ring/ring-jetty-adapter "0.3.11"]
                                   [ring/ring-core "1.0.0"]]}
             :test {:dependencies []}}
  :warn-on-reflection true
  :javac-options ["-source" "1.6" "-target" "1.6"]
  :java-source-paths ["src/java"]
  :repositories {"JBoss" {:url "http://repository.jboss.org/nexus/content/groups/public/"
                          :snapshots false}})
