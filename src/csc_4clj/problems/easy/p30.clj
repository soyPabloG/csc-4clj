(ns csc-4clj.problems.p30)

;; 30. Compress a Sequence
;;
;; URL: http://www.4clojure.com/problem/30
;;
;; Description:
;; Write a function which removes consecutive duplicates from a sequence.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
