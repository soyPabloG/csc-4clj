(ns csc-4clj.problems.p53)

;; 53. Longest Increasing Sub-Seq
;;
;; URL: http://www.4clojure.com/problem/53
;;
;; Description:
;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;;
;; Tags: seqs

(defn consecutives [coll]
  (if-not (empty? coll)
    (let [[f & r] coll]
      (loop [[s & r-s] r
             solution  (vector (vector f))]
        (if (nil? s)
          solution
          (if (< 0 (- s (last (last solution))) 2)
            (recur r-s (update solution (- (count solution) 1) #(conj % s)))
            (recur r-s (conj solution (vector s)))))))
    []))

(def __
  (fn [coll]
    (apply max-key count [] (filter #(> (count %) 1) (consecutives coll)))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])

(= (__ [5 6 1 3 2 7]) [5 6])

(= (__ [2 3 3 4 5]) [3 4 5])

(= (__ [7 6 5 4]) [])
