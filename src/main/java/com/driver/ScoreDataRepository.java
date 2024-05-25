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
        String playerName = score.getPlayerName();
        List<Score> scores= playerScores.getOrDefault(playerName,new ArrayList<>());
        scores.add(score);
        playerScores.put(playerName, scores);
    }

    public List<Score> getScoresByPlayer(String playerName) {
    	//your code goes here
        return playerScores.getOrDefault(playerName, new ArrayList<>());
    }

    public List<Score> getAllScores() {
    	//your code goes here
        List<Score> allScores = new ArrayList<>();
        for(List<Score> scoreList : playerScores.values()){
            allScores.addAll(scoreList);
        }
        return allScores;
    }
}

