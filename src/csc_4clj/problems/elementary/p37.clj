(ns csc-4clj.problems.p37)

;; 37. Regular Expressions
;;
;; URL: http://www.4clojure.com/problem/37
;;
;; Description:
;; Regex patterns are supported with a special reader macro.
;;
;; Tags: regex, syntax

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
