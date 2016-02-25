package games

import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory

class PokerHand {
  final static Logger log = LoggerFactory.getLogger(PokerHand)

  String identify(hand) {
    return "unknown hand: ${hand}"
  }
}
