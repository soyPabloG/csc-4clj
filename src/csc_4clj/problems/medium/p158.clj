(ns csc-4clj.problems.p158)

;; 158. Decurry
;;
;; URL: http://www.4clojure.com/problem/158
;;
;; Description:
;; Write a function that accepts a curried function of unknown arity <i>n</i>.  Return an equivalent function of <i>n</i> arguments.
;;<br/>
;;You may wish to read <a href="http://en.wikipedia.org/wiki/Currying">this</a>.
;;
;; Tags: partial-functions

(def __
  (fn [f]
    (fn [& args]
      (loop [f'       f
             rem-args args]
        (if (seq rem-args)
          (recur (f' (first rem-args)) (next rem-args))
          f')))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 10 ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (+ a b c d))))))
       1 2 3 4))

(= 24 ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (* a b c d))))))
       1 2 3 4))

(= 25 ((__ (fn [a]
             (fn [b]
               (* a b))))
       5 5))
