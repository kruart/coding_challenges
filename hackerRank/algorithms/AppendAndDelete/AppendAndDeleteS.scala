package algorithms.AppendAndDelete

// https://www.hackerrank.com/challenges/append-and-delete/problem
object AppendAndDeleteS extends App {
  def appendAndDelete(s: String, t: String, k: Int): String = {
    val totalLength = s.length + t.length
    if (k >= totalLength) return "Yes"

    val min = Math.min(s.length, t.length)
    val sameLength = (0 until min)
      .find(i => s(i) != t(i))
      .getOrElse(min)

    val diff = totalLength - 2*sameLength
    if (k >= diff && (k - diff) % 2 == 0) "Yes"
    else "No"
  }

  val read = () => scala.io.StdIn.readLine()

  val (s, t, k) = (read(), read(), read().trim.toInt)
  println(appendAndDelete(s, t, k))
}