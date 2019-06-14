(ns csc-4clj.problems.p126)

;; 126. Through the Looking Class
;;
;; URL: http://www.4clojure.com/problem/126
;;
;; Description:
;; Enter a value which satisfies the following:
;;
;; Tags: fun, brain-teaser

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(let [x __]
  (and (= (class x) x) x))
