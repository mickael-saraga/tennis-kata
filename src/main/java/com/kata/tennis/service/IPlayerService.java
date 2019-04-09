package com.kata.tennis.service;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface IPlayerService {

  Collection getFirstScores();
  
  int getPossibleScore();
}
