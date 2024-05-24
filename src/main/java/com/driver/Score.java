package com.driver;

public class Score {
    private String playerName;
    private int score;

    public Score(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
    	//your code goes here
        return playerName;
    }

    public int getScore() {
    	//your code goes here
        return score;
    }
}
