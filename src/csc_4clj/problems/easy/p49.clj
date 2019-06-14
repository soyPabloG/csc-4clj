(ns csc-4clj.problems.p49)

;; 49. Split a sequence
;;
;; URL: http://www.4clojure.com/problem/49
;;
;; Description:
;; Write a function which will split a sequence into two parts.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: split-at


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])

(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
