package scalatraining.actors.supervision

import java.util.Date

import se.scalablesolutions.akka.actor.Actor.Sender.Self

import org.scalatest.junit.JUnitSuite
import org.junit.{After, Before, Test}

class SimulationTest extends JUnitSuite {
  private var shipKR: Ship = _
  private var portSFO, portLA, portYYV: Port = _

  portSFO = new Port("San Francisco")
  portLA = new Port("Los Angeles")
  portYYV = new Port("Vancouver")
  shipKR = new Ship("King Roy", portYYV)

  @Test def shouldDoNothing = assert(true)

/*
  @Test def runSimulation = {
    EventProcessor.start
    EventProcessor ! Register(shipKR)

    println("\n===> arrivalSetsShipsLocation")

    EventProcessor ! DepartureEvent(new Date(2009, 2, 1), portSFO, shipKR)
    Thread.sleep(500)

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 3), portSFO, shipKR)
    Thread.sleep(500)

    assert(portSFO === (shipKR !! CurrentPort).get)

    println("\n===> departurePutsShipOutToSea")

// ------- NEW -------
    shipKR ! Sink
// ------- NEW -------

    EventProcessor ! DepartureEvent(new Date(2009, 2, 4), portLA, shipKR)
    Thread.sleep(500)

    assert(Port.AT_SEA === (shipKR !! CurrentPort).get)

    println("\n===> smallTrip")

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 5), portLA, shipKR)
    Thread.sleep(500)

    EventProcessor ! DepartureEvent(new Date(2009, 2, 6), portYYV, shipKR)
    Thread.sleep(500)

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 8), portYYV, shipKR)
    Thread.sleep(500)

    EventProcessor ! DepartureEvent(new Date(2009, 2, 9), portSFO, shipKR)
    Thread.sleep(500)

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 11), portSFO, shipKR)
    Thread.sleep(500)

    assert(portSFO === (shipKR !! CurrentPort).get)

    println("\n===> resetAndReplayEventLog")

    shipKR ! Reset

    EventProcessor ! Replay
    Thread.sleep(500)

    assert(portSFO === (shipKR !! CurrentPort).get)

    println("\n===> resetAndReplayEventLogUpToDate")

    shipKR ! Reset

    EventProcessor ! ReplayUpTo(new Date(2009, 2, 4))
    Thread.sleep(500)

    assert(Port.AT_SEA === (shipKR !! CurrentPort).get)
  }
*/
}
