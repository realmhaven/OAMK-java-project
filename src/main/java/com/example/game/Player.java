package com.example.game;

// to import org.json, we added a dependency in POM.XML
import org.json.simple.JSONObject;

public class Player {
    private String name;
    private Integer gamesPlayed;
    private Integer totalMoves;

    JSONObject playerFile = new JSONObject();

    public String player(String name) {
        playerFile.put("name is : ", name);
        return playerFile.toString();
    }

    public void savePlayer() {
        
    }

    public void loadPlayer() {

    }

}
