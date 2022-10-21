package com.example.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    Game g = new Game();
    Player p = new Player();

    // Game.java
    @PostMapping("/game")
    public String createGame() {
        g.createGame();
        return "game is started";
    }

    @PutMapping("/game")
    public String makemove(@RequestParam Integer move) {
        // every time a move is done countMoves is called
        p.countMoves();
        return g.play(move);
    }

    // Player.java
    // POST localhost:8080/player?name=Arnaud
    @PostMapping("/player")
    public String setPlayerName(@RequestParam String name) {
        p.setName(name);
        return "You chose the name : " + name;
    }

    // GET localhost:8080/player
    @GetMapping("/player")
    public String getPlayerName() {
        return p.getName();
    }

}
