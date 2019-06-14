(ns csc-4clj.problems.p35)

;; 35. Local bindings
;;
;; URL: http://www.4clojure.com/problem/35
;;
;; Description:
;; Clojure lets you give local names to values using the special let-form.
;;
;; Tags: syntax

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ (let [x 5] (+ 2 x)))

(= __ (let [x 3, y 10] (- y x)))

(= __ (let [x 21] (let [y 3] (/ x y))))
