package games

import spock.lang.Specification

class PokerHandSpec extends Specification {
  PokerHand pokerHand

  def setup() {
    pokerHand = new PokerHand()
  }

  void 'it returns unkown for an unknown hand'() {
    when:
    def score = pokerHand.score('2s 3s 4s 5s 6s')

    then:
    score.contains('unknown hand')
  }
}
