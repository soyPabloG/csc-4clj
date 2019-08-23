(ns csc-4clj.problems.p54)

;; 54. Partition a Sequence
;;
;; URL: http://www.4clojure.com/problem/54
;;
;; Description:
;; Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: partition, partition-all


;(def __
;  (fn [n coll]
;    (loop [[f & r :as rem-coll]  coll
;           acc                   []
;           solution              []]
;      (println coll)
;      (cond
;        (= (count acc) n) (recur rem-coll [] (conj solution acc))
;        (nil? f) solution
;        :else (recur r (conj acc f) solution)))))

(def __
  (fn [n coll]
    (when (>= (count coll) n)
      (lazy-seq (cons (take n coll) (__ n (drop n coll)))))))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))

(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))
