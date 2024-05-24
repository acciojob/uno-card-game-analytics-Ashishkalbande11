package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreDataRepository {
    private Map<String, List<Score>> playerScores;

    public ScoreDataRepository() {
        this.playerScores = new HashMap<>();
    }

    public void storeScore(Score score) {
    	//your code goes here
    }

    public List<Score> getScoresByPlayer(String playerName) {
    	//your code goes here
        return playerScores.getOrDefault(playerName, new ArrayList<>());
    }

    public List<Score> getAllScores() {
    	//your code goes here
        return allScores;
    }
}

