package com.kata.tennis.service;

import com.kata.tennis.model.PlayerFlag;
import org.springframework.stereotype.Service;

@Service
public interface IGameService {
  
  int getCurrentPointWinner();
  
  PlayerFlag getPointWinner();
}
