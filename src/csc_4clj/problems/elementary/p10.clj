(ns csc-4clj.problems.p10)

;; 10. Intro to Maps
;;
;; URL: http://www.4clojure.com/problem/10
;;
;; Description:
;; Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
;;
;; Tags: 

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ ((hash-map :a 10, :b 20, :c 30) :b))

(= __ (:b {:a 10, :b 20, :c 30}))
