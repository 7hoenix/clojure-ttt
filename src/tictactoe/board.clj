(ns tictactoe.board)

(def board {:a "a" :s "s" :d "d"
            :f "f" :g "g" :h "h"
            :j "j" :k "k" :l "l"})

(defn make-move
  [move]
  (def board (conj board move)))
