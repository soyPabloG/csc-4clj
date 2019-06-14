(ns csc-4clj.problems.p8)

;; 8. Intro to Sets
;;
;; URL: http://www.4clojure.com/problem/8
;;
;; Description:
;; Sets are collections of unique values.
;;
;; Tags: 

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= __ (set '(:a :a :b :c :c :c :c :d :d)))

(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
