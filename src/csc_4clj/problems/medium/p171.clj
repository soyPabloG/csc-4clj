(ns csc-4clj.problems.p171)

;; 171. Intervals
;;
;; URL: http://www.4clojure.com/problem/171
;;
;; Description:
;; Write a function that takes a sequence of integers and returns a sequence of "intervals".  Each interval is a a vector of two integers, start and end, such that all integers between start and end (inclusive) are contained in the input sequence.
;;
;; Tags:

;(def __
;  (fn [coll]
;    (map
;      #(vector (first %) (last %))
;      (let [last-seen (atom 0)]
;        (partition-by
;          #(if (<= (- % @last-seen) 1)
;             (do (reset! last-seen %) true)
;             (do (reset! last-seen %) false))
;          (sort coll))))))

(defn consecutives [coll]
  (if-not (empty? coll)
    (let [[f & r] (sort coll)]
      (loop [[s & r-s] r
             solution  (vector (vector f))]
        (if (nil? s)
          solution
          (if (<= (- s (last (last solution))) 1)
            (recur r-s (update solution (- (count solution) 1) #(conj % s)))
            (recur r-s (conj solution (vector s)))))))
    []))

(def __
  (fn [coll]
    (map
      #(vector (first %) (last %))
      (consecutives coll))))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 2 3]) [[1 3]])

(= (__ [10 9 8 1 2 3]) [[1 3] [8 10]])

(= (__ [1 1 1 1 1 1 1]) [[1 1]])

(= (__ []) [])

(= (__ [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
       [[1 4] [6 6] [9 11] [13 17] [19 19]])
