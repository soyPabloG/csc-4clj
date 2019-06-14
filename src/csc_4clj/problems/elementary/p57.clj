(ns csc-4clj.problems.p57)

;; 57. Simple Recursion
;;
;; URL: http://www.4clojure.com/problem/57
;;
;; Description:
;; A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.
;;
;; Tags: recursion

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
