(ns csc-4clj.problems.p103)

;; 103. Generating k-combinations
;;
;; URL: http://www.4clojure.com/problem/103
;;
;; Description:
;; Given a sequence S consisting of n elements generate all <a href="https://secure.wikimedia.org/wikipedia/en/wiki/Combination">k-combinations</a> of S, i. e. generate all possible sets consisting of k distinct elements taken from S.
;;
;;The number of k-combinations for a sequence is equal to the <a href="https://secure.wikimedia.org/wikipedia/en/wiki/Binomial_coefficient">binomial coefficient</a>.
;;
;; Tags: seqs, combinatorics

(def power-set
  (fn [set]
    (if (empty? set)
      #{#{}}
      (let [[s & ss] set
            sss      (power-set ss)]
        (clojure.set/union sss (map #(conj % s) sss))))))

(def __
  (fn [n set]
    (apply conj #{} (filter #(= n (count %)) (power-set set)))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 1 #{4 5 6}) #{#{4} #{5} #{6}})

(= (__ 10 #{4 5 6}) #{})

(= (__ 2 #{0 1 2}) #{#{0 1} #{0 2} #{1 2}})

(= (__ 3 #{0 1 2 3 4}) #{#{0 1 2} #{0 1 3} #{0 1 4} #{0 2 3} #{0 2 4}
                         #{0 3 4} #{1 2 3} #{1 2 4} #{1 3 4} #{2 3 4}})

(= (__ 4 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a "abc" "efg"}})

(= (__ 2 #{[1 2 3] :a "abc" "efg"}) #{#{[1 2 3] :a} #{[1 2 3] "abc"} #{[1 2 3] "efg"}
                                    #{:a "abc"} #{:a "efg"} #{"abc" "efg"}})
