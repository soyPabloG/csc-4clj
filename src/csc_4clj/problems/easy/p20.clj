(ns csc-4clj.problems.p20)

;; 20. Penultimate Element
;;
;; URL: http://www.4clojure.com/problem/20
;;
;; Description:
;; Write a function which returns the second to last element from a sequence.
;;
;; Tags: seqs

(def __
  (fn [coll]
    (let [[f s & r] coll]
      (if (nil? r)
        f
        (recur (next coll))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ (list 1 2 3 4 5)) 4)

(= (__ ["a" "b" "c"]) "b")

(= (__ [[1 2] [3 4]]) [1 2])
