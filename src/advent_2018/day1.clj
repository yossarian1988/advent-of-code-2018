(ns advent-2018.day1
  (:require [flatland.ordered.set :as ordered]))

;; puzzle input
(def puzzle-input [+3 +8 -5 +15 +9 -17 +11 -6 +11 -14 -11 +6 +9 -7 +19 -17 -18 -18 +13 +8 -19 -17 +3 +18 -7 -2 -7 -20 +7 -9 -3 -15 +3 -11 -4 +5 -19 +4 +12 -6 +13 +19 +17 -1 +11 +8 +4 -19 -8 -16 +5 +9 -2 -2 -14 -21 -4 -12 +14 +13 -3 -14 -18 -16 -13 -6 +14 +11 +1 +16 +16 +5 -11 -15 -19 -11 -10 -9 -16 +15 -7 +5 +18 -5 +6 -10 +8 +14 -20 -17 -17 +19 -14 -8 -17 +1 -19 -4 -3 -8 +3 +2 +19 +12 +18 -14 +3 +13 +4 -19 -3 +6 +18 +5 -1 +17 +18 +12 -14 +16 +16 -4 +15 +17 +10 -7 +8 -6 +10 +8 +6 +4 +17 -15 -1 +12 +3 +9 +10 +17 +13 +18 -2 +1 +7 +13 +9 -6 +15 -8 -18 +19 -9 -19 -8 -1 +17 +16 +5 +18 +5 +4 +7 +10 +9 -3 -15 +5 -16 +17 +16 -19 -2 -6 +19 -16 +6 -2 -11 -11 +1 -4 +16 -6 -11 -19 -20 +13 +2 -3 -3 -16 +11 +18 +11 +4 -5 -11 +17 +21 +20 +10 -5 +19 -9 -18 -6 +20 +16 -13 -18 +12 -5 +17 +19 +2 -10 +14 +16 +1 +13 -7 -4 +17 +1 -13 -6 -13 -1 +18 +5 -19 -15 -17 -5 +18 +14 -13 +8 -17 +20 +12 -7 +3 +20 +15 -9 -9 +5 +7 +13 -10 -8 -19 +18 -12 -21 -15 -12 -4 +17 +2 -10 +20 -2 -3 +15 -16 -3 -15 -17 -6 +24 +6 +3 +19 +10 -2 +35 +21 +8 -13 -13 +11 +5 +15 +17 -3 +15 +11 +1 -18 -4 +8 +9 -16 +14 -13 +11 +16 -1 -2 +14 +15 +4 -16 +8 -5 +6 +9 -19 +5 +7 +2 +4 +10 -2 +7 +5 -16 +17 -3 +4 +8 -6 +8 +14 -8 -13 +9 +7 +6 +3 +5 -1 +19 -20 -11 +17 +18 +16 +10 +2 -3 -17 +11 +2 +14 -1 -19 +5 -2 -4 +3 -7 -12 -12 -15 +21 -32 -25 -14 -13 -14 -15 -9 -13 +5 -10 +3 -17 +2 +19 -17 +5 +19 -12 +15 -19 -4 +14 +14 +9 -15 +4 +3 +6 +14 +7 -5 +19 +10 +16 -17 -13 +16 -35 -5 +12 -18 +5 -10 +9 +12 -8 -34 -3 -2 -30 -7 -15 -6 -7 -6 -4 +39 +20 -3 -7 +11 +7 -21 +6 +9 -20 +16 -13 -16 +14 +5 +18 -7 -4 -22 -18 +17 +12 -14 +6 +1 +15 +21 +65 +67 +19 +37 +32 +5 +25 -18 -11 +13 -18 -1 -22 -10 +1 +16 +59 -11 +4 +24 +4 +19 -9 -5 -14 +13 -12 +5 +11 -10 -10 +5 -28 -21 -19 -49 -16 +14 +5 +111 -15 +9 +17 +10 +17 -5 +17 +12 +5 +18 -19 +14 +12 +21 -12 +4 -14 -4 -17 +16 +17 +6 -12 -39 -22 +18 -9 +3 +13 -21 +17 +16 -34 -9 -31 +117 +13 -2 +12 +5 +3 -49 +6 +38 +16 +102 +4 +102 +110 +98 +72104 +14 +10 -8 -1 +12 +6 -5 +8 -19 +14 +19 +10 -13 +16 -8 -12 -6 +15 +16 +14 +17 -3 +5 +7 -13 -6 -15 +10 +14 +9 +16 -3 +2 -12 -5 -2 +8 -18 -5 -19 +2 +16 -15 +11 -17 +7 +6 -18 -7 -19 -16 -9 -7 +10 +10 +3 -4 -17 -15 -14 +18 +18 -8 -7 -12 +14 +10 -11 +13 +18 +20 -15 +22 +2 -17 +16 -4 -2 -6 -15 +2 +16 -8 +2 +2 +23 +8 +1 +15 -13 -19 +5 +13 -12 -3 -16 +35 +16 +16 -19 -9 +5 +19 +16 -7 +18 +9 +17 -2 -11 +14 +13 -17 -5 -4 +6 +19 -8 -15 -10 -2 -16 +14 -11 +3 +2 -6 -12 -2 +16 +6 +17 -20 -15 -24 +8 +6 -20 +18 +44 -19 +10 +2 -6 +9 +3 +21 +12 -6 +7 +10 -1 +10 +6 +12 +13 +2 -6 +14 +5 +14 +10 -9 +2 -7 -12 -5 -11 +10 -4 +14 -6 +17 +7 +1 -3 -13 -16 +12 -22 -3 -6 -21 +3 +10 +4 +11 -8 +2 -13 +1 -16 -10 +18 -1 +17 +11 -10 -4 +10 -21 -12 -5 -13 +25 -17 +16 -20 -3 +13 +2 +3 -4 -20 +1 -10 -9 -9 +16 +5 +8 +6 +14 +15 +1 +1 +8 -19 +17 +41 +18 +6 -12 +10 +11 -12 +22 -1 +7 +8 -4 -7 -18 -13 +16 +14 -9 +5 -7 -11 -16 -12 -19 -19 +12 +2 +16 -7 -1 +20 +3 +6 -26 +8 -4 +18 +22 -7 +19 +1 +1 +12 +13 +11 +2 +6 +6 -8 -5 -7 +19 +11 +1 -8 +16 +12 +3 -9 +1 +12 -9 -12 +3 +15 +1 +13 -2 -1 +10 -12 +18 -12 -20 +2 +9 +13 -15 +13 +14 +8 +3 -19 +14 -11 +8 +1 +14 +13 -17 -17 -15 -6 +18 +7 +4 +10 -17 +1 +22 +7 -1 -5 +3 +18 +6 -13 -7 -9 +19 +14 -5 -4 -7 +1 +22 +18 +18 -17 -4 +13 +2 +15 -4 +18 -6 -19 -12 -11 +16 -3 -3 -19 -16 +6 -20 -19 +6 +4 +10 +18 -4 +14 +3 -5 -19 +1 -11 -20 -1 -2 +17 +26 +6 +10 -1 +5 -7 +11 +18 +16 -8 +14 -7 -5 -5 +18 +7 +13 -6 -11 +15 -22 -12 -4 -12 +10 -7 -14 -3 +16 +4 +17 +10 -18 -22 +1 +14 -11 -22 +10 -26 -73113])

;; reduce
(reduce + 0 puzzle-input) ;533

;; find first frequency that's repeated
(defn reset-idx? [idx max]
  (if (< idx (dec max))
    (inc idx)
    0))

(defn first-repeat [input]
  (loop [f (ordered/ordered-set)
         sum 0
         idx 0]
    (if (contains? f sum)
      (println (str "repeated frequency " sum))
      (recur (conj f sum) (+ (nth input idx) sum) (reset-idx? idx (count input))))))


(first-repeat [+3 +3 +4 -2 -4]) ;; 10

(first-repeat puzzle-input) ;;73272








