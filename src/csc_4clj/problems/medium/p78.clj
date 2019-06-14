(ns csc-4clj.problems.p78)

;; 78. Reimplement Trampoline
;;
;; URL: http://www.4clojure.com/problem/78
;;
;; Description:
;; Reimplement the function described in <a href="76"> "Intro to Trampoline"</a>.
;;
;; Tags: core-functions
;;
;; Special restrictions: trampoline


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (__ triple 2))
  82)

(= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial __ my-even?) (range 6)))
  [true false true false true false])
