package com.driver;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UNOTrackerService {
    private ScoreDataRepository scoreDataRepository;

    public UNOTrackerService(ScoreDataRepository scoreDataRepository) {
        this.scoreDataRepository = scoreDataRepository;
    }

    public void storeScoreData(ScoreDTO scoreDTO) {
    	//your code goes here
    }

    public double calculateAverageScore(String playerName) {
    	//your code goes here
    }

    public String identifyTopPlayer() {
    	//your code goes here
    }
}
