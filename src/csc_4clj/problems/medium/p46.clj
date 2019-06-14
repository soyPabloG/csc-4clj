(ns csc-4clj.problems.p46)

;; 46. Flipping out
;;
;; URL: http://www.4clojure.com/problem/46
;;
;; Description:
;; Write a higher-order function which flips the order of the arguments of an input function.
;;
;; Tags: higher-order-functions

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 3 ((__ nth) 2 [1 2 3 4 5]))

(= true ((__ >) 7 8))

(= 4 ((__ quot) 2 8))

(= [1 2 3] ((__ take) [1 2 3 4 5] 3))
