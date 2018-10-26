package algorithms.RepeatedString

// https://www.hackerrank.com/challenges/repeated-string/forum
object RepeatedStringSc extends App {
  def repeatedString(s: String, n: Long): Long = {
    var countA: Long = s.count(_ == 'a')
    val factor: Long = n / s.length
    val remainder: Long = n % s.length

    countA = factor * countA
    (0L until remainder).foreach(i => if (s(i.toInt) == 'a') countA += 1)

    countA
  }

  println(repeatedString("aba", 10)) //7
  println(repeatedString("a", 1000000000000L)) //1000000000000
}
