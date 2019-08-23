(ns csc-4clj.problems.p115)

;; 115. The Balance of N
;;
;; URL: http://www.4clojure.com/problem/115
;;
;; Description:
;; A balanced number is one whose component digits have the same sum on the left and right halves of the number.  Write a function which accepts an integer n, and returns true iff n is balanced.
;;
;; Tags: math

(defn digits [n]
  (->> n
       str
       (map #(Character/getNumericValue %))))

(def __
  (fn [n]
    (let [n             (digits n)
          [f-dig l-dig] (split-at (/ (count n) 2) n)]
      (=
        (apply + (if (odd? (count n))
                   (drop-last f-dig)
                   f-dig))
        (apply + l-dig)))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= true (__ 11))

(= true (__ 121))

(= false (__ 123))

(= true (__ 0))

(= false (__ 88099))

(= true (__ 89098))

(= true (__ 89089))

(= (take 20 (filter __ (range)))
   [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101])
