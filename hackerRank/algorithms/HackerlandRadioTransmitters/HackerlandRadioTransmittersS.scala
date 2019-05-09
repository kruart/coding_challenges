package algorithms.HackerlandRadioTransmitters

// https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
object HackerlandRadioTransmittersS extends App {
  def hackerlandRadioTransmitters(x: Array[Int], k: Int): Int = {
    val s = x.sorted
    var count = 1
    var leftCoverage = 0
    var lastTransmitter = s(0)

    s.foreach(currHouse => {
      if (currHouse - lastTransmitter + leftCoverage <= k)  {
        leftCoverage += currHouse - lastTransmitter
        lastTransmitter = currHouse
      } else if (currHouse - lastTransmitter > k) {
        count += 1
        leftCoverage = 0
        lastTransmitter = currHouse
      }
    })
    count
  }

  // doesn't pass due timeout
  def hackerlandRadioTransmitters2(x: Array[Int], k: Int): Int = {
    val s = x.sorted
    def tail(arr: Array[Int] = s, count: Int = 1, leftCov: Int = 0, lastTransmitter: Int = s(0)): Int = arr match {
      case Array() => count
      case a if a.head - lastTransmitter + leftCov <= k => tail(a.tail, count, leftCov + a.head - lastTransmitter, a.head)
      case a if a.head - lastTransmitter > k => tail(a.tail, count + 1, 0, a.head)
      case _ => tail(arr.tail, count, leftCov, lastTransmitter)
    }
    tail()
  }

  val stdin = scala.io.StdIn

  val Array(_, k) = stdin.readLine.split(" ").map(_.trim.toInt)
  val x = stdin.readLine.split(" ").map(_.trim.toInt)

  println(hackerlandRadioTransmitters(x, k))
}