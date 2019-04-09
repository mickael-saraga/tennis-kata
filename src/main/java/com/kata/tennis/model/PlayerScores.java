package com.kata.tennis.model;

import java.util.Arrays;

public abstract class PlayerScores {
  
  public enum Scores {
    ZERO(0),
    FIFTEEN(15),
    THIRTY(30),
    FORTY(40);
    
    private Integer numericScore;
  
    Scores(Integer numericScore) {
      this.numericScore = numericScore;
    }
  
    public Integer getNumericScore() {
      return numericScore;
    }
  }
  
  public static void movingScore() {
    Arrays.asList(Scores.values()).forEach(s -> {
      System.out.println(s);
      System.out.println(s.getNumericScore());
    });
  }
  
  public static Scores nextScore(Scores previous) {
    return Arrays.stream(Scores.values())
                 .filter(score -> score.numericScore > previous.numericScore)
                 .findFirst().get();
  }
  
  public static int nextNumericScore(int previous) {
    if (previous != 40) {
      return Arrays.stream(Scores.values())
                   .filter(score -> score.numericScore > previous)
                   .findFirst().get().numericScore;
    } else {
      return 0;
    }
  }
  
}
