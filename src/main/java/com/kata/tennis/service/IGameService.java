package com.kata.tennis.service;

import com.kata.tennis.model.Player;
import com.kata.tennis.model.PlayerFlag;
import org.springframework.stereotype.Service;

@Service
public interface IGameService {
  
  int getCurrentPointWinner();
  
  PlayerFlag getPointWinner();
  
  Player nextPointWinner(Player p1, Player p2);
}
