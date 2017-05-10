(ns spacemacs-clojure.core)
(require 'clojure.string)

(defn foo
  [x]
  (clojure.string/split x #","))

(foo "sup,dude")

