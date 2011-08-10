(defproject ring-netty-adapter "0.0.1"
  :description "Ring Netty adapter"
  :dependencies [[clojure "1.2.1"]
                 [ring/ring-core "0.3.11"]
                 [org.jboss.netty/netty  "3.2.5.Final"]]
  :dev-dependencies [[swank-clojure "1.3.2"]
                     [clj-http "0.1.3"]]
  :warn-on-reflection true
  :repositories {"JBoss"
                 "http://repository.jboss.org/nexus/content/groups/public/"})
