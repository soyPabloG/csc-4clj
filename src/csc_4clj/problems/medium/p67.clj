(ns csc-4clj.problems.p67)

;; 67. Prime Numbers
;;
;; URL: http://www.4clojure.com/problem/67
;;
;; Description:
;; Write a function which returns the first x
;;number of prime numbers.
;;
;; Tags: primes

(defn prime? [n]
  (nil?
    (some #(zero? (mod n %))
          (range 2 n))))

(defn primes
  ([] (cons 2 (lazy-seq (primes 2))))
  ([n]
    (let [new-prime (first (filter prime? (drop (inc n) (range))))]
      (cons new-prime (lazy-seq (primes new-prime))))))

(def __
  (fn [n]
    (take n (primes))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 2) [2 3])

(= (__ 5) [2 3 5 7 11])

(= (last (__ 100)) 541)
