package com.joel.akka.actors

import akka.actor.{Actor, Props}

case class Greeting(who: String)

class GreetingsActor extends Actor {

  override def receive: Receive = {
    case g: Greeting => println(s"Hello ${g.who}.")
  }
}

object GreetingsActor {
  def props: Props = Props(new GreetingsActor())
}
