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

(defn next-prime [n]
  (let [succ-n (inc n)]
    (if (prime? succ-n)
      succ-n
      (recur succ-n))))

(defn primes
  ([] (lazy-seq (cons 2 (primes (next-prime 2)))))
  ([p]
   (lazy-seq (cons p (primes (next-prime p))))))

(def __
  (fn [n]
    (take n (primes))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 2) [2 3])

(= (__ 5) [2 3 5 7 11])

(= (last (__ 100)) 541)
