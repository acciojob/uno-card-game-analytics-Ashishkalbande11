package com.driver;

public class ScoreDataConverter {
    public Score convertToEntity(ScoreDTO scoreDTO) {
    	//your code goes here
        return new Score(scoreDTO.getPlayerName(), scoreDTO.getScore());
    }

    public ScoreDTO convertToDTO(Score score) {
    	//your code goes here
        return new ScoreDTO(score.getPlayerName(), score.getScore());
    }
}

