(ns csc-4clj.problems.p121)

;; 121. Universal Computation Engine
;;
;; URL: http://www.4clojure.com/problem/121
;;
;; Description:
;; 	 Given a mathematical formula in prefix notation, return a function that calculates
;;	 the value of the formula.
;;	 The formula can contain nested calculations using the four basic
;;	 mathematical operators, numeric constants, and symbols representing variables.
;;	 The returned function has to accept a single parameter containing the map
;;	 of variable names to their values.
;;
;;
;; Tags: functions
;;
;; Special restrictions: eval, resolve

(defn eval-seq [formula variables]
  (cond
    (seq? formula) (let [[op & args] formula
                         operators   {'+ + '- - '* * '/ /}]
                     (apply (get operators op) (map #(eval-seq % variables) args)))
    (number? formula) formula
    :else (get variables formula)))

(def __
  (fn [formula]
    #(eval-seq formula %)))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 2 ((__ '(/ a b))
      '{b 8 a 16}))

(= 8 ((__ '(+ a b 2))
      '{a 2 b 4}))

(= [6 0 -4]
     (map (__ '(* (+ 2 a)
  	              (- 10 b)))
	        '[{a 1 b 8}
	          {b 5 a -2}
	          {a 2 b 11}]))

(= 1 ((__ '(/ (+ x 2)
              (* 3 (+ y 1))))
      '{x 4 y 1}))
