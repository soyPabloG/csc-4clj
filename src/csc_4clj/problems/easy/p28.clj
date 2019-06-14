(ns csc-4clj.problems.p28)

;; 28. Flatten a Sequence
;;
;; URL: http://www.4clojure.com/problem/28
;;
;; Description:
;; Write a function which flattens a sequence.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: flatten


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))

(= (__ '((((:a))))) '(:a))
