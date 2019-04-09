package com.kata.tennis

import com.kata.tennis.service.IPlayerService
import com.kata.tennis.service.PlayerService
import spock.lang.Specification
import spock.lang.Unroll


class PlayerSpec extends Specification {
  
  IPlayerService service = new PlayerService()
  
  def "It should give the initial score"() {
    expect:
    service.firstScores.size() == 2
  }
  
  @Unroll("Repeat #i times")
  def "It should give any possible tennis score"() {
    given:
    def scores = [0, 15, 30, 40]
    
    when:
    def score = service.possibleScore
    
    then:
    println(score)
    assert scores.contains(score)
    
    where:
    i << (1..15)
  }
  
  
}
