package algorithms.AliceAndBobsSillyGame

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

// https://www.hackerrank.com/challenges/alice-and-bobs-silly-game/problem
object AliceAndBobsSillyGameSc extends App {
  // Sieve of Eratosthenes algorithm
  def sillyGame(n: Int): String = {
    var isAliceMove = true
    val sieve = ArrayBuffer.fill(n + 1)(false)

    for(p <- 2 to n if !sieve(p))  {
      isAliceMove = !isAliceMove
      (p to n by p).foreach(sieve(_) = true)
    }
    if (isAliceMove) "Bob" else "Alice"
  }

  val n = StdIn.readInt
  (1 to n).foreach(_ => println(sillyGame(StdIn.readInt)))
}
