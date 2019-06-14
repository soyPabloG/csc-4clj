(ns csc-4clj.problems.p21)

;; 21. Nth Element
;;
;; URL: http://www.4clojure.com/problem/21
;;
;; Description:
;; Write a function which returns the Nth element from a sequence.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: nth


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ '(4 5 6 7) 2) 6)

(= (__ [:a :b :c] 0) :a)

(= (__ [1 2 3 4] 1) 2)

(= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
