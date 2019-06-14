(ns csc-4clj.problems.p41)

;; 41. Drop Every Nth Item
;;
;; URL: http://www.4clojure.com/problem/41
;;
;; Description:
;; Write a function which drops every Nth item from a sequence.
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (__ [:a :b :c :d :e :f] 2) [:a :c :e])

(= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])
