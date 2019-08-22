(ns csc-4clj.problems.p22)

;; 22. Count a Sequence
;;
;; URL: http://www.4clojure.com/problem/22
;;
;; Description:
;; Write a function which returns the total number of elements in a sequence.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: count


(def __
  (fn [coll]
    (if (empty? coll)
      0
      (loop [[f & r] coll
             count   1]
        (if (nil? r)
          count
          (recur r (inc count)))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ '(1 2 3 3 1)) 5)

(= (__ "Hello World") 11)

(= (__ [[1 2] [3 4] [5 6]]) 3)

(= (__ '(13)) 1)

(= (__ '(:a :b :c)) 3)
