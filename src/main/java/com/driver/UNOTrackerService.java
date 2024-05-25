package com.driver;

import java.util.HashMap;
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
        Score score = new ScoreDataConverter().convertToEntity(scoreDTO);
        scoreDataRepository.storeScore(score);

    }

    public double calculateAverageScore(String playerName) {
    	//your code goes here

        List<Score> scoreList = scoreDataRepository.getScoresByPlayer(playerName);
        if(scoreList.size() == 0){
            return 0.0;
        }
        double totalScore = 0.0;
        for(Score score : scoreList){
            totalScore += score.getScore();
        }
        return totalScore/scoreList.size();
    }

    public String identifyTopPlayer() {
    	//your code goes here
        String topPlayer = null;
        double maxScore = 0.0;
        List<Score> scoreList = scoreDataRepository.getAllScores();
        if(scoreList.size()==0){
            return "No scores are available";
        }
        HashMap<String , Double> scoreMap = new HashMap<>();
        HashMap<String , Integer> countMap = new HashMap<>();

        for(Score score : scoreList){
            String playerName = score.getPlayerName();
            scoreMap.put(playerName, scoreMap.getOrDefault(playerName,0.0) + score.getScore());
            countMap.put(playerName, countMap.getOrDefault(playerName,0)+1);
        }
        for(String playerName : scoreMap.keySet()){
            double averageScore = scoreMap.get(playerName);
            averageScore /= countMap.get(playerName);

            if(averageScore > maxScore){
                maxScore = averageScore;
                topPlayer = playerName;
            }
        }
        return topPlayer;
    }
}
