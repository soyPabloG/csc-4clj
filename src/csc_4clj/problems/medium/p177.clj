(ns csc-4clj.problems.p177)

;; 177. Balancing Brackets
;;
;; URL: http://www.4clojure.com/problem/177
;;
;; Description:
;; When parsing a snippet of code it's often a good idea to do a sanity check to see if all the brackets match up. Write a function that takes in a string and returns truthy if all square [ ] round ( ) and curly { } brackets are properly paired and legally nested, or returns falsey otherwise.
;;
;; Tags: parsing

(def brackets-classes {\[ :square \] :square \( :round \) :round \{ :curly \} :curly})

;(def __
;  (fn [string]
;    (loop [stack   []
;           [f & r] string]
;      (let [char-class (get brackets-classes f)]
;        (cond
;          (nil? f) (empty? stack)
;          (= f \[) (recur (conj stack char-class) r)
;          (= f \]) (if (= char-class (peek stack))
;                     (recur (pop stack) r)
;                     false)
;          (= f \() (recur (conj stack char-class) r)
;          (= f \)) (if (= char-class (peek stack))
;                     (recur (pop stack) r)
;                     false)
;          (= f \{) (recur (conj stack char-class) r)
;          (= f \}) (if (= char-class (peek stack))
;                     (recur (pop stack) r)
;                     false)
;          :else (recur stack r))))))

(def brackets-info {\[ {:class :square :type :open}
                    \] {:class :square :type :close}
                    \( {:class :round :type :open}
                    \) {:class :round :type :close}
                    \{ {:class :curly :type :open}
                    \} {:class :curly :type :close}})

(def __
  (fn [string]
    (loop [stack   []
           [f & r] string]
      (let [char-info (get brackets-info f)]
        (cond
          ;; Reach the end of the string.
          (nil? f) (empty? stack)

          ;; Current char is a bracket.
          (some (partial = f) (keys brackets-info))
          (cond
            (= (:type char-info) :open) (recur (conj stack (:class char-info)) r)
            (= (:type char-info) :close) (if (= (:class char-info) (peek stack))
                                           (recur (pop stack) r)
                                           false))

          :else (recur stack r))))))

;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(__ "This string has no brackets.")

(__ "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }")

(not (__ "(start, end]"))

(not (__ "())"))

(not (__ "[ { ] } "))

(__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")

(not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))

(not (__ "["))
