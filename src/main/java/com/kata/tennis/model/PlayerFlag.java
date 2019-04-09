package com.kata.tennis.model;

public enum PlayerFlag {
  
  ONE, TWO;
  
  public static int getNumericFlag(PlayerFlag flag) {
    return  flag.ordinal() + 1;
  }
}
