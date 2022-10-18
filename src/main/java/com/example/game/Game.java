package com.example.game;

public class Game {
    Integer move;
    Integer number = 1;

    public void createGame() {
        this.number = 1 + (int) (10 * Math.random());

    }

    public String play(Integer move) {

        if (this.number == move) {
            return "win";
        } else if (this.number > move) {
            return "it is greater than " + move;
        } else if (this.number < move) {
            return "it is shorter than " + move;
        }
        return "Game finished";
    }

}
