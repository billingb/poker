package games

import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory

class Application {
  @SuppressWarnings('PropertyName')
  final static Logger log = LoggerFactory.getLogger(Application)

  @SuppressWarnings('CatchException')
  static void run(String[] args) {
    PokerHand pokerHand = new PokerHand()
    println pokerHand.identify(args[0])
  }

  static void main(String[] args) {
    run(args)
  }
}

