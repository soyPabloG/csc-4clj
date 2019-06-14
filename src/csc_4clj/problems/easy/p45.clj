(ns csc-4clj.problems.p45)

;; 45. Intro to Iterate
;;
;; URL: http://www.4clojure.com/problem/45
;;
;; Description:
;; The iterate function can be used to produce an infinite lazy sequence.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ (take 5 (iterate #(+ 3 %) 1)))
