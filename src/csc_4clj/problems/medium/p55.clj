(ns csc-4clj.problems.p55)

;; 55. Count Occurrences
;;
;; URL: http://www.4clojure.com/problem/55
;;
;; Description:
;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: frequencies


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= (__ [:b :a :b :a :b]) {:a 2, :b 3})

(= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
