(ns csc-4clj.problems.p81)

;; 81. Set Intersection
;;
;; URL: http://www.4clojure.com/problem/81
;;
;; Description:
;; Write a function which returns the intersection of two sets.  The intersection is the sub-set of items that each set has in common.
;;
;; Tags: set-theory
;;
;; Special restrictions: intersection


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})

(= (__ #{0 1 2} #{3 4 5}) #{})

(= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
