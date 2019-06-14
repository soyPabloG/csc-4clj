(ns csc-4clj.problems.p36)

;; 36. Let it Be
;;
;; URL: http://www.4clojure.com/problem/36
;;
;; Description:
;; Can you bind x, y, and z so that these are all true?
;;
;; Tags: math, syntax

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 10 (let __ (+ x y)))

(= 4 (let __ (+ y z)))

(= 1 (let __ z))
