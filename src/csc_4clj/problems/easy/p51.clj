(ns csc-4clj.problems.p51)

;; 51. Advanced Destructuring
;;
;; URL: http://www.4clojure.com/problem/51
;;
;; Description:
;; Here is an example of some more sophisticated destructuring.
;;
;; Tags: destructuring

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))
