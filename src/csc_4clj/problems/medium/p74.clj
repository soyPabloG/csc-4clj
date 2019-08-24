(ns csc-4clj.problems.p74)

;; 74. Filter Perfect Squares
;;
;; URL: http://www.4clojure.com/problem/74
;;
;; Description:
;; Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
;;
;; Tags:

(defn perfect-square? [n]
  (let [sqrt-n (Math/sqrt n)]
    (= (Math/floor sqrt-n) sqrt-n)))

(def __
  (fn [string]
    (apply str
           (interpose
             ","
             (filter #(perfect-square? (Integer/parseInt %))
                     (re-seq #"\d+" string))))))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(= (__ "4,5,6,7,8,9") "4,9")

(= (__ "15,16,25,36,37") "16,25,36")
