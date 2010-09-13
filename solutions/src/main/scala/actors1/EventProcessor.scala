package scalatraining.actors

import se.scalablesolutions.akka.actor.Actor

// =============================
// Event processor and storage
// =============================

class EventProcessor extends Actor {
  private var eventLog: List[StateChangeEvent] = Nil
  
  def receive = {
    case event: StateChangeEvent =>
      event.process
      eventLog ::= event

    case Replay =>
      eventLog.reverse.foreach(_.process)

    case ReplayUpTo(date) =>
      eventLog.reverse.filter(_.occurred.getTime <= date.getTime).foreach(_.process)

    case unknown =>
      log.error("Unknown event: %s", unknown)
      throw new UnsupportedOperationException("No handler for message [" + unknown + "]")
  }
}
