package algorithms.Encryption

import scala.collection.mutable.ArrayBuffer

// https://www.hackerrank.com/challenges/encryption/problem
object EncryptionSc extends App {
  def encryption(s: String): String = {
    val str = s.replaceAll(" ", "")
    val cols = scala.math.sqrt(str.length).ceil.toInt

    val arr = new ArrayBuffer[String]
    for (i <- 0 until cols) {
      var word = ""
      for (j <- i until str.length by cols) {
        word += str(j)
      }
      arr += word
    }
   arr.mkString(" ")
  }

  val result1 = encryption("if man was meant to stay on the ground god would have given us roots")
  println(result1)  // imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

  println(encryption("haveaniceday"))   // hae and via ecy
  println(encryption("feedthedog"))    // fto ehg ee dd
}
