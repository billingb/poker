package games

import spock.lang.Specification

class PokerHandSpec extends Specification {
  PokerHand pokerHand

  def setup() {
    pokerHand = new PokerHand()
  }

  void 'it returns unknown for an unknown hand'() {
    when:
    def desc = pokerHand.identify('2s 3s 4s 5s 6s')

    then:
    desc.contains('unknown hand')
  }
}
