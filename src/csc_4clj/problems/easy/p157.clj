(ns csc-4clj.problems.p157)

;; 157. Indexing Sequences
;;
;; URL: http://www.4clojure.com/problem/157
;;
;; Description:
;; Transform a sequence into a sequence of pairs containing the original elements along with their index.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]])

(= (__ [0 1 3]) '((0 0) (1 1) (3 2)))

(= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])
