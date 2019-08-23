(ns csc-4clj.problems.p108)

;; 108. Lazy Searching
;;
;; URL: http://www.4clojure.com/problem/108
;;
;; Description:
;; <p>Given any number of sequences, each sorted from smallest to largest, find the smallest single number which appears in all of the sequences. The sequences may be infinite, so be careful to search lazily.</p>
;;
;; Tags: seqs, sorting

(def __
  (fn [& colls]
    (cond
      (some nil? colls) nil
      (apply = (map first colls)) (ffirst colls)
      :else
      (let [min (first (apply min-key first colls))]
        (recur (map #(if (= (first %) min)
                      (drop 1 %)
                      %)
                    colls))))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= 3 (__ [3 4 5]))

(= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19]))

(= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13]))

(= 64 (__ (map #(* % % %) (range)) ;; perfect cubes
          (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
          (iterate inc 20))) ;; at least as large as 20

(= 1024 (__ (map #(* % % % % %) (range))
            (filter #(zero? (bit-and % (dec %))) (range))
            (iterate inc 40)))
