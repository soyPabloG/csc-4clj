(ns csc-4clj.problems.p40)

;; 40. Interpose a Seq
;;
;; URL: http://www.4clojure.com/problem/40
;;
;; Description:
;; Write a function which separates the items of a sequence by an arbitrary value.
;;
;; Tags: seqs, core-functions
;;
;; Special restrictions: interpose


(def __
  (fn []
    ,,,))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ 0 [1 2 3]) [1 0 2 0 3])

(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")

(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
