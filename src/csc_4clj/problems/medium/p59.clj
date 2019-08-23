(ns csc-4clj.problems.p59)

;; 59. Juxtaposition
;;
;; URL: http://www.4clojure.com/problem/59
;;
;; Description:
;; Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
;;
;; Tags: higher-order-functions, core-functions
;;
;; Special restrictions: juxt


(def __
  (fn [& fns]
    (fn [& args]
      (reduce #(conj %1 (apply %2 args)) [] fns))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= [21 6 1] ((__ + max min) 2 3 5 1 6 4))

(= ["HELLO" 5] ((__ #(.toUpperCase %) count) "hello"))

(= [2 6 4] ((__ :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))
