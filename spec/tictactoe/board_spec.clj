(ns tictactoe.board-spec
  (:require [speclj.core :refer :all]
            [tictactoe.board :refer :all]))

(describe "Display Board"
  (it "returns a blank board"
      (let [temp-board { :a "a", :s "s", :d "d",
                    :f "f", :g "g", :h "h",
                    :j "j", :k "k", :l "l"}]
        (should= temp-board display-board))))

;; :a "a", :s "s", :d "d",
;; :f "f", :g "g", :h "h",
;; :j "j", :k "k", :l "l"
