package com.kata.tennis.util;

import java.util.Random;

import static com.kata.tennis.model.PlayerFlag.ONE;
import static com.kata.tennis.model.PlayerFlag.TWO;
import static com.kata.tennis.model.PlayerFlag.getNumericFlag;

public class PlayerFlagHelper {
  
  public static int generateRandomNumericFlag() {
    return new Random().nextInt((getNumericFlag(TWO) - getNumericFlag(ONE)) + 1) + 1;
  }
}
