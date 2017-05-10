;; namespaces, require, use and import

;; If we were running these things in the REPL,
;; we would need to require these libs:

;;    (require 'clojure.string)
;;    (require 'clojure.test)

(ns spacemacs-clojure.core)

;; You can require namespaces with an alias using the keyword :as, like so:
(require '[clojure.string :as string])

(defn foo
  [x]
  (string/split x #","))

(foo "sup,dude") ;; ["sup" "dude"]

(clojure.test/is (= 1 2)) ;; false
(clojure.test/is (= "server.js" "server.js")) ;; true

