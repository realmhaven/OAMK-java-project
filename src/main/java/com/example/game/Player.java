package com.example.game;

// to import org.json, we added a dependency in POM.XML
import org.json.simple.JSONObject;

public class Player {
    String name;
    Integer gamesPlayed;
    Integer totalMoves;

    public String player(String name) {
        JSONObject file = new JSONObject();
        file.put("name is : ", name);
        return file.toString();
    }

    public void savePlayer() {

    }

    public void loadPlayer() {

    }

}
