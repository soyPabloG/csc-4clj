(ns csc-4clj.problems.p60)

;; 60. Sequence Reductions
;;
;; URL: http://www.4clojure.com/problem/60
;;
;; Description:
;; Write a function which behaves like reduce, but returns each intermediate value of the reduction.  Your function must accept either two or three arguments, and the return sequence must be lazy.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: reductions


(def __
  (fn
    ([f coll] (__ f (first coll) (next coll)))
    ([f init-v coll] (cons init-v
                           (lazy-seq (when coll
                                       (let [[next-v & r] coll]
                                         (__ f (f init-v next-v) r))))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (take 5 (__ + (range))) [0 1 3 6 10])

(= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

(= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
