(ns csc-4clj.problems.p144)

;; 144. Oscilrate
;;
;; URL: http://www.4clojure.com/problem/144
;;
;; Description:
;; Write an oscillating iterate: a function that takes an initial value and a variable number of functions. It should return a lazy sequence of the functions applied to the value in order, restarting from the first function after it hits the end.
;;
;; Tags: sequences

(def __
  (fn [init-v & fns]
    ((fn oscilrate
       ([] (lazy-seq (cons init-v (oscilrate init-v (flatten (repeat fns))))))
       ([v fns] (let [new-v ((first fns) v)]
                  (lazy-seq (cons new-v (oscilrate new-v (next fns))))))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (take 3 (__ 3.14 int double)) [3.14 3 3.0])

(= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7])

(= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])
