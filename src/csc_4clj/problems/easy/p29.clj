(ns csc-4clj.problems.p29)

;; 29. Get the Caps
;;
;; URL: http://www.4clojure.com/problem/29
;;
;; Description:
;; Write a function which takes a string and returns a new string containing only the capital letters.
;;
;; Tags: strings

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ "HeLlO, WoRlD!") "HLOWRD")

(empty? (__ "nothing"))

(= (__ "\$#A(*&987Zf") "AZ")
