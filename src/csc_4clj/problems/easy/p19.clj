(ns csc-4clj.problems.p19)

;; 19. Last Element
;;
;; URL: http://www.4clojure.com/problem/19
;;
;; Description:
;; Write a function which returns the last element in a sequence.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: last


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 2 3 4 5]) 5)

(= (__ '(5 4 3)) 3)

(= (__ ["b" "c" "d"]) "d")
