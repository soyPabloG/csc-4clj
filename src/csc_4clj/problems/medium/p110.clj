(ns csc-4clj.problems.p110)

;; 110. Sequence of pronunciations
;;
;; URL: http://www.4clojure.com/problem/110
;;
;; Description:
;; <p>Write a function that returns a lazy sequence of "pronunciations" of a sequence of numbers. A pronunciation of each element in the sequence consists of the number of repeating identical numbers and the number itself. For example, <code>[1 1]</code> is pronounced as <code>[2 1]</code> ("two ones"), which in turn is pronounced as <code>[1 2 1 1]</code> ("one two, one one").</p><p>Your function should accept an initial sequence of numbers, and return an infinite lazy sequence of pronunciations, each element being a pronunciation of the previous element.</p>
;;
;; Tags: seqs

(def __
  (fn [coll]
    (let [partition     (partition-by identity coll)
          counts        (map count partition)
          pronunciation (interleave counts (map first partition))]
      (lazy-seq (cons pronunciation (__ pronunciation))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= [[1 1] [2 1] [1 2 1 1]] (take 3 (__ [1])))

(= [3 1 2 4] (first (__ [1 1 1 4 4])))

(= [1 1 1 3 2 1 3 2 1 1] (nth (__ [1]) 6))

(= 338 (count (nth (__ [3 2]) 15)))
