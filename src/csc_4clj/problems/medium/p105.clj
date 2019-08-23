(ns csc-4clj.problems.p105)

;; 105. Identify keys and values
;;
;; URL: http://www.4clojure.com/problem/105
;;
;; Description:
;; Given an input sequence of keywords and numbers, create a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.
;;
;; Tags: maps, seqs

;(def __
;  (fn [coll]
;    (loop [[f & r]  (let [seen (atom true)]
;                      (partition-by #(when (keyword? %)
;                                       (reset! seen (not @seen)))
;                                    coll))
;           solution {}]
;      (if (nil? f)
;        solution
;        (let [key     (first f)
;              pos-val (first r)]
;          (if (or (keyword? (first pos-val)) (nil? pos-val))
;            (recur r (assoc solution key []))
;            (recur (next r) (assoc solution key pos-val))))))))

(def __
  (fn [coll]
    (reduce #(cond
               ;; Its a duple with a keyword and a sequence of numbers.
               (and (keyword? (ffirst %2)) (number? (first (second %2))))
               (assoc %1 (ffirst %2) (second %2))

               ;; Its a duple with a pair of keywords.
               (and (keyword? (ffirst %2)) (keyword? (first (second %2))))
               (assoc %1 (ffirst %2) [])

               :else %1)
      {}
      (partition-all 2
                     1
                     (let [seen (atom true)]
                       (partition-by #(when (keyword? %)
                                        (reset! seen (not @seen)))
                                     coll))))))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= {} (__ []))

(= {:a [1]} (__ [:a 1]))

(= {:a [1], :b [2]} (__ [:a 1, :b 2]))

(= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4]))
