package com.kata.tennis.service;

import com.kata.tennis.model.Player;
import com.kata.tennis.model.PlayerFlag;
import com.kata.tennis.util.PlayerFlagHelper;

import java.util.Random;

import static com.kata.tennis.model.PlayerFlag.*;

public class GameService implements IGameService {
  
  @Override
  public int getCurrentPointWinner() {
    int flagPlayer1 = new Player("player1", ONE).getFlag().ordinal() + 1;
    int flagPlayer2 = new Player("player2", TWO).getFlag().ordinal() + 1;
    return new Random().nextInt((flagPlayer2 - flagPlayer1) + 1) + flagPlayer1;
  }
  
  @Override
  public PlayerFlag getPointWinner() {
    int flagResult = PlayerFlagHelper.generateRandomNumericFlag();
    return flagResult == 1 ? ONE : TWO;
  }
  
  @Override
  public Player nextPointWinner(Player player1, Player player2) {
    PlayerFlag flagWinner = getPointWinner();
    return flagWinner == ONE ? player1 : player2;
  }
  
  
  
}
