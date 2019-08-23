(ns csc-4clj.problems.p116)

;; 116. Prime Sandwich
;;
;; URL: http://www.4clojure.com/problem/116
;;
;; Description:
;; A <a href="http://en.wikipedia.org/wiki/Balanced_prime">balanced prime</a> is a prime number which is also the mean of the primes directly before and after it in the sequence of valid primes.  Create a function which takes an integer n, and returns true iff it is a balanced prime.
;;
;; Tags: math

(defn prime? [n]
  (nil?
    (some #(zero? (mod n %))
          (range 2 n))))

(defn next-prime [f n]
  (let [next-n (f n)]
    (if (prime? next-n)
      next-n
      (recur f next-n))))

(def __
  (fn [p]
    (if (and (> p 2) (prime? p))
      (let [next-p (next-prime inc p)
            prev-p (next-prime dec p)]
        (= p (/ (+ next-p prev-p) 2)))
      false)))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= false (__ 4))

(= true (__ 563))

(= 1103 (nth (filter __ (range)) 15))
