package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/eval-ex/problem
object Evaluating_exFP extends App {
    (1 to StdIn.readInt).foreach(_ => {
      val n = StdIn.readDouble
      val res = (1 to 9).foldLeft(1d) { (acc, v) => acc + math.pow(n, v) / (1 to v).product }
      println(f"$res%.4f")  //1,0
//      println("%.4f".formatLocal(java.util.Locale.US, res))   //1.0
    })
}
