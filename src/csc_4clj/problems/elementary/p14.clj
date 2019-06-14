(ns csc-4clj.problems.p14)

;; 14. Intro to Functions
;;
;; URL: http://www.4clojure.com/problem/14
;;
;; Description:
;; Clojure has many different ways to create functions.
;;
;; Tags: 

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ ((fn add-five [x] (+ x 5)) 3))

(= __ ((fn [x] (+ x 5)) 3))

(= __ (#(+ % 5) 3))

(= __ ((partial + 5) 3))
