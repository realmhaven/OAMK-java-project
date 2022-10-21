package com.example.game;

// to import org.json, we added a <dependency> in POM.XML
import org.json.simple.JSONObject;

public class Player {
    private String name;
    private Integer gamesPlayed = 0;
    private Integer totalMoves = 0;

    // every time countMoves is called, totalMoves is incremented
    public void countMoves() {
        this.totalMoves += 1;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return this.name;
    }

}
