(ns csc-4clj.problems.p141)

;; 141. Tricky card games
;;
;; URL: http://www.4clojure.com/problem/141
;;
;; Description:
;; <p>
;;  In <a href="http://en.wikipedia.org/wiki/Trick-taking_game">trick-taking
;;  card games</a> such as bridge, spades, or hearts, cards are played
;;  in groups known as "tricks" - each player plays a single card, in
;;  order; the first player is said to "lead" to the trick. After all
;;  players have played, one card is said to have "won" the trick. How
;;  the winner is determined will vary by game, but generally the winner
;;  is the highest card played <i>in the suit that was
;;  led</i>. Sometimes (again varying by game), a particular suit will
;;  be designated "trump", meaning that its cards are more powerful than
;;  any others: if there is a trump suit, and any trumps are played,
;;  then the highest trump wins regardless of what was led.
;;</p>
;;<p>
;;  Your goal is to devise a function that can determine which of a
;;  number of cards has won a trick. You should accept a trump suit, and
;;  return a function <code>winner</code>. Winner will be called on a
;;  sequence of cards, and should return the one which wins the
;;  trick. Cards will be represented in the format returned
;;  by <a href="/problem/128/">Problem 128, Recognize Playing Cards</a>:
;;  a hash-map of <code>:suit</code> and a
;;  numeric <code>:rank</code>. Cards with a larger rank are stronger.
;;</p>
;;
;; Tags: game, cards

(defn winner [cards lead-suit]
  (last (sort-by :rank (filter #(= lead-suit (:suit %)) cards))))

(def __
  (fn [trump-suit]
    (fn [cards]
      (let [winner-by-trump (winner cards trump-suit)]
        (if (nil? winner-by-trump)
          (winner cards (:suit (first cards)))
          winner-by-trump)))))


;;;;;;;;;;;
;; Tests ;;
;;;;;;;;;;;

(let [notrump (__ nil)]
  (and (= {:suit :club :rank 9}  (notrump [{:suit :club :rank 4}
                                           {:suit :club :rank 9}]))
       (= {:suit :spade :rank 2} (notrump [{:suit :spade :rank 2}
                                           {:suit :club :rank 10}]))))

(= {:suit :club :rank 10} ((__ :club) [{:suit :spade :rank 2}
                                       {:suit :club :rank 10}]))

(= {:suit :heart :rank 8}
   ((__ :heart) [{:suit :heart :rank 6} {:suit :heart :rank 8}
                 {:suit :diamond :rank 10} {:suit :heart :rank 4}]))
