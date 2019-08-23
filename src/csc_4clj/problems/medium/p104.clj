(ns csc-4clj.problems.p104)

;; 104. Write Roman Numerals
;;
;; URL: http://www.4clojure.com/problem/104
;;
;; Description:
;; This is the inverse of <a href='92'>Problem 92</a>, but much easier. Given an integer smaller than 4000, return the corresponding roman numeral in uppercase, adhering to the <a href='http://www.numericana.com/answer/roman.htm#valid'>subtractive principle</a>.
;;
;; Tags: strings, math

(def __
  (fn [n]
    (loop [n        n
           solution ""]
      (cond
        (>= n 1000) (recur (- n 1000) (str solution "M"))
        (>= n 900) (recur (- n 900) (str solution "CM"))
        (>= n 500) (recur (- n 500) (str solution "D"))
        (>= n 400) (recur (- n 400) (str solution "CD"))
        (>= n 100) (recur (- n 100) (str solution "C"))
        (>= n 90) (recur (- n 90) (str solution "XC"))
        (>= n 50) (recur (- n 50) (str solution "L"))
        (>= n 40) (recur (- n 40) (str solution "XL"))
        (>= n 10) (recur (- n 10) (str solution "X"))
        (>= n 9) (recur (- n 9) (str solution "IX"))
        (>= n 5) (recur (- n 5) (str solution "V"))
        (>= n 4) (recur (- n 4) (str solution "IV"))
        (>= n 1) (recur (- n 1) (str solution "I"))
        (= n 0) solution))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= "I" (__ 1))

(= "XXX" (__ 30))

(= "IV" (__ 4))

(= "CXL" (__ 140))

(= "DCCCXXVII" (__ 827))

(= "MMMCMXCIX" (__ 3999))

(= "XLVIII" (__ 48))
