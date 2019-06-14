(ns csc-4clj.problems.p162)

;; 162. Logical falsity and truth
;;
;; URL: http://www.4clojure.com/problem/162
;;
;; Description:
;; In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.
;;
;; Tags: logic

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ (if-not false 1 0))

(= __ (if-not nil 1 0))

(= __ (if true 1 0))

(= __ (if [] 1 0))

(= __ (if [0] 1 0))

(= __ (if 0 1 0))

(= __ (if 1 1 0))
