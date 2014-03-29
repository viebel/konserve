(defproject konserve "0.1.0-SNAPSHOT"
  :description "Durable key-value store protocol with core.async."
  :url "http://github.com/ghubber/konserve"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [org.clojure/core.async "0.1.278.0-76b25b-alpha"]
                 [com.ashafa/clutch "0.4.0-RC1"]]

  :plugins [[lein-cljsbuild "1.0.1"]
            [com.keminglabs/cljx "0.3.2"]
            [com.cemerick/austin "0.1.3"]]

  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :clj}

                  {:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :cljs}]}

  :hooks [cljx.hooks]

  :cljsbuild
  {:builds
   [{:source-paths ["src/cljs"
                    "target/classes"]
     :compiler
     {:output-to "resources/public/js/main.js"
      :optimizations :simple
      :pretty-print true}}]})