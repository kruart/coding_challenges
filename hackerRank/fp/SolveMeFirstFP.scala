package fp

// https://www.hackerrank.com/challenges/fp-solve-me-first/problem
object SolveMeFirstFP {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}
