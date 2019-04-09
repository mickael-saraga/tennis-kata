package com.kata.tennis;

import com.kata.tennis.model.Player;
import com.kata.tennis.service.GameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.kata.tennis.model.PlayerFlag.ONE;
import static com.kata.tennis.model.PlayerFlag.TWO;
import static com.kata.tennis.model.PlayerScores.*;

@SpringBootApplication
public class StartGame {
  
  public static void main(String[] args) {
  
    GameService gameService = new GameService();
  
    Player player1 = new Player("Player 1", ONE, 0, 0);
    Player player2 = new Player("Player 2", TWO, 0, 0);
  
    int i = 1;
    while (player1.getActualScore() <= 40 || player2.getActualScore() <= 40) {
      
      Player pointWinner = gameService.nextPointWinner(player1, player2);
      
      pointWinner.setPreviousScore(pointWinner.getActualScore());
      pointWinner.setActualPointScore(pointWinner.getPreviousPointScore());
      int nextScore = nextNumericScore(pointWinner.getPreviousScore());
      pointWinner.setActualScore(nextScore);
      
      System.out.println(i + " - " + pointWinner.getName() + " - " + pointWinner.getActualScore());
      
      if (pointWinner.getFlag() == ONE) {
        player1 = pointWinner;
      } else {
        player2 = pointWinner;
      }
      i++;
      if (pointWinner.getActualScore() == 0) {
        System.out.println("\n" + pointWinner.getName() + " wins the game !");
        break;
      }
      
    }
    
//    SpringApplication.run(StartGame.class);
  }
  
}
