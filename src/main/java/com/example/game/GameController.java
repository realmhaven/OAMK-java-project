package com.example.game;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    Game g = new Game();

    @PostMapping("/game")
    public String createGame() {
        g.createGame();
        return "game is started";

    }

    @PutMapping("/game")
    public String makemove(@RequestParam Integer move) {
        return g.play(move);
    }

}
