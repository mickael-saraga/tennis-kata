package com.kata.tennis.model;

import com.kata.tennis.model.PlayerScores.Scores;
import org.springframework.stereotype.Component;

@Component
public class Player {
  
  private String name;
  private PlayerFlag flag;
  private int previousScore;
  private int actualScore;
  private Scores previousPointScore;
  private Scores actualPointScore;
  
  public Player(String name, PlayerFlag flag) {
    this.name = name;
    this.flag = flag;
  }
  
  public Player(int previousScore, int actualScore) {
    this.previousScore = previousScore;
    this.actualScore = actualScore;
  }
  
  public Player(String name, PlayerFlag flag, int previousScore, int actualScore) {
    this.name = name;
    this.flag = flag;
    this.previousScore = previousScore;
    this.actualScore = actualScore;
  }
  
  public Player(String name, PlayerFlag flag, Scores previousPointScore, Scores actualPointScore) {
    this.name = name;
    this.flag = flag;
    this.previousPointScore = previousPointScore;
    this.actualPointScore = actualPointScore;
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
  
  public Scores getPreviousPointScore() {
    return previousPointScore;
  }
  
  public void setPreviousPointScore(Scores previousPointScore) {
    this.previousPointScore = previousPointScore;
  }
  
  public Scores getActualPointScore() {
    return actualPointScore;
  }
  
  public void setActualPointScore(Scores actualPointScore) {
    this.actualPointScore = actualPointScore;
  }
}
