(ns tictactoe.board-spec
  (:require [speclj.core :refer :all]
            [tictactoe.board :refer :all]))

(describe "Display Board"
  (it "returns a blank board"
      (let [temp-board {:a "a" :s "s" :d "d"
                        :f "f" :g "g" :h "h"
                        :j "j" :k "k" :l "l"}]
        (should= temp-board board))))

(describe "move"
  (it "adds a move to a list of moves"
      (let [temp-board {:a "x" :s "s" :d "d"
                        :f "f" :g "g" :h "h"
                        :j "j" :k "k" :l "l"},
            move {:a "x"}]
        (make-move move)
        (should= temp-board board))))
