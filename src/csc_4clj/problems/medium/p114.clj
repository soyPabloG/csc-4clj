(ns csc-4clj.problems.p114)

;; 114. Global take-while
;;
;; URL: http://www.4clojure.com/problem/114
;;
;; Description:
;; <p><a
;;href="http://clojuredocs.org/clojure_core/clojure.core/take-while">take-while</a>
;;is great for filtering sequences, but it limited: you can only examine
;;a single item of the sequence at a time. What if you need to keep
;;track of some state as you go over the sequence?</p>
;;
;;<p>Write a function which accepts an integer <code>n</code>, a predicate <code>p</code>, and a sequence. It should return a lazy sequence of items in the list up to, but not including, the <code>n</code>th item that satisfies the predicate.</p>
;;
;; Tags: seqs, higher-order-functions

(def __
  (fn [n p-fn coll]
    (loop [n        n
           p-fn     p-fn
           [f & r]  coll
           solution []]
      (if (p-fn f)
        (if (= n 1)
          solution
          (recur (- n 1) p-fn r (conj solution f)))
        (recur n p-fn r (conj solution f))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= [2 3 5 7 11 13]
   (__ 4 #(= 2 (mod % 3))
         [2 3 5 7 11 13 17 19 23]))

(= ["this" "is" "a" "sentence"]
   (__ 3 #(some #{\i} %)
         ["this" "is" "a" "sentence" "i" "wrote"]))

(= ["this" "is"]
   (__ 1 #{"a"}
         ["this" "is" "a" "sentence" "i" "wrote"]))
