package com.joel.akka

import akka.actor.ActorSystem
import com.joel.akka.actors.{Greeting, GreetingsActor}
import com.typesafe.config.{Config, ConfigFactory}

/**
 * Akka Actors works by creating actor hierarchies. A supervisor actor is responsible for dealing
 * with the failures. There are four possibilities to deal with failures: restart, resume, stop or
 * escalate. Furthermore, there are two supervision strategies: one-for-one or all-for-one.
 */
object Main {

  val actorSystem: ActorSystem = ActorSystem.create("system")

  def main(args: Array[String]) : Unit = {
    val greeter = actorSystem.actorOf(GreetingsActor.props)
    greeter ! Greeting("Johannes")
    greeter ! Greeting("Uwe")
  }

}
