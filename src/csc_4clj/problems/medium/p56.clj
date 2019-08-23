(ns csc-4clj.problems.p56)

;; 56. Find Distinct Items
;;
;; URL: http://www.4clojure.com/problem/56
;;
;; Description:
;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: distinct


(def __
  (fn [coll]
    (reduce #(if (some (partial = %2) %1) %1 (conj %1 %2))
            []
            coll)))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 2 1 3 1 2 4]) [1 2 3 4])

(= (__ [:a :a :b :b :c :c]) [:a :b :c])

(= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

(= (__ (range 50)) (range 50))
