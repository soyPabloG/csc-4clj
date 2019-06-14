(ns csc-4clj.problems.p61)

;; 61. Map Construction
;;
;; URL: http://www.4clojure.com/problem/61
;;
;; Description:
;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;;
;; Tags: core-functions
;;
;; Special restrictions: zipmap


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})

(= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})

(= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
