(ns csc-4clj.problems.p27)

;; 27. Palindrome Detector
;;
;; URL: http://www.4clojure.com/problem/27
;;
;; Description:
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;                Hint: "racecar" does not equal '(\\r \\a \\c \\e \\c \\a \\r)
;;
;; Tags: seqs

(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(false? (__ '(1 2 3 4 5)))

(true? (__ "racecar"))

(true? (__ [:foo :bar :foo]))

(true? (__ '(1 1 3 3 1 1)))

(false? (__ '(:a :b :c)))
