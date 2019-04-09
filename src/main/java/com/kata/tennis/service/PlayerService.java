package com.kata.tennis.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class PlayerService implements IPlayerService {
  
  @Override
  public Collection getFirstScores() {
    return Arrays.asList(0, 0);
  }
  
  @Override
  public int getPossibleScore() {
    int playerResult = 10 * (new Random().nextInt((4 - 0) + 1) + 0);
    return (playerResult == 10 || playerResult == 20) ? 15 : playerResult;
  }
  
}
