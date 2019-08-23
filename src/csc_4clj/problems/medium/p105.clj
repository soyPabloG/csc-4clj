(ns csc-4clj.problems.p105)

;; 105. Identify keys and values
;;
;; URL: http://www.4clojure.com/problem/105
;;
;; Description:
;; Given an input sequence of keywords and numbers, create a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.
;;
;; Tags: maps, seqs

(def __
  (fn [coll]
    (loop [[f & r]  (let [seen (atom true)]
                      (partition-by #(when (keyword? %)
                                    (reset! seen (not @seen)))
                                    coll))
           solution {}]
      (if (nil? f)
        solution
        (let [key     (first f)
              pos-val (first r)]
          (if (or (keyword? (first pos-val)) (nil? pos-val))
            (recur r (assoc solution key []))
            (recur (next r) (assoc solution key pos-val))))))))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= {} (__ []))

(= {:a [1]} (__ [:a 1]))

(= {:a [1], :b [2]} (__ [:a 1, :b 2]))

(= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4]))
