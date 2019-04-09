package com.kata.tennis.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Player {
  
  private String name;
  private PlayerFlag flag;
  private int previousScore;
  private int actualScore;
  
  public Player(String name, PlayerFlag flag) {
    this.name = name;
    this.flag = flag;
  }
  
  public Player(int previousScore, int actualScore) {
    this.previousScore = previousScore;
    this.actualScore = actualScore;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public PlayerFlag getFlag() {
    return flag;
  }
  
  public void setFlag(PlayerFlag flag) {
    this.flag = flag;
  }
  
  public int getPreviousScore() {
    return previousScore;
  }
  
  public void setPreviousScore(int previousScore) {
    this.previousScore = previousScore;
  }
  
  public int getActualScore() {
    return actualScore;
  }
  
  public void setActualScore(int actualScore) {
    this.actualScore = actualScore;
  }

}
