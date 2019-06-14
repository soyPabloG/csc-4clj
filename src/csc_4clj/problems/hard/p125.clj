(ns csc-4clj.problems.p125)

;; 125. Gus' Quinundrum
;;
;; URL: http://www.4clojure.com/problem/125
;;
;; Description:
;; Create a function of no arguments which returns a string that is an <i>exact</i> copy of the function itself.
;;<br /><br />
;;Hint: read <a href="http://en.wikipedia.org/wiki/Quine_(computing)">this</a> if you get stuck (this question is harder than it first appears); but it's worth the effort to solve it independently if you can!
;;<br /><br />
;;Fun fact: Gus is the name of the <a href="http://i.imgur.com/FBd8z.png">4Clojure dragon</a>.
;;
;; Tags: logic, fun, brain-teaser

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (str '__) (__))
