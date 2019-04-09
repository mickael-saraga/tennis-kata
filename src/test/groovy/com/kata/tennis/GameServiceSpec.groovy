package com.kata.tennis

import com.kata.tennis.model.PlayerFlag
import com.kata.tennis.model.PlayerScores
import com.kata.tennis.service.GameService
import com.kata.tennis.service.IGameService
import spock.lang.Specification
import spock.lang.Unroll

import static com.kata.tennis.model.PlayerScores.Scores.*

class GameServiceSpec extends Specification {
  
  IGameService service = new GameService()
  
  @Unroll("repeat #i times")
  def "It should return current point winner"() {
    
    when:
    def winner = service.pointWinner
    
    then:
    assert winner in [PlayerFlag.ONE, PlayerFlag.TWO]
    println(winner)
    
    where:
    i << (1..15)
  }
  
  def "Iterating"() {
    
    expect:
    PlayerScores.movingScore()
  }
  
  def "Getting nextNumericPointScore"() {
    
    expect:
    PlayerScores.nextNumericScore(previous) == next
    
    where:
    previous | next
    0        | 15
    15       | 30
    30       | 40
  }
  
  def "Getting nextPointScore"() {
    
    expect:
    PlayerScores.nextScore(previous) == next
    
    where:
    previous | next
    ZERO     | FIFTEEN
    FIFTEEN  | THIRTY
    THIRTY   | FORTY
  }
  
}
