(ns csc-4clj.problems.p161)

;; 161. Subset and Superset
;;
;; URL: http://www.4clojure.com/problem/161
;;
;; Description:
;; Set A is a subset of set B, or equivalently B is a superset of A, if A is "contained" inside B. A and B may coincide.
;;
;; Tags: set-theory

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(clojure.set/superset? __ #{2})

(clojure.set/subset? #{1} __)

(clojure.set/superset? __ #{1 2})

(clojure.set/subset? #{1 2} __)
