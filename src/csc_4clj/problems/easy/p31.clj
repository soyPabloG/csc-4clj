(ns csc-4clj.problems.p31)

;; 31. Pack a Sequence
;;
;; URL: http://www.4clojure.com/problem/31
;;
;; Description:
;; Write a function which packs consecutive duplicates into sub-lists.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
