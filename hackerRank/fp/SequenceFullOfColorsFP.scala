package fp

import scala.io.StdIn

// https://www.hackerrank.com/challenges/sequence-full-of-colors/problem
object SequenceFullOfColorsFP {

  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    (1 to n).foreach(_ => println(if (isSeqCorrect(StdIn.readLine().toList)) "True" else "False"))
  }

  // recursion
  // if we take String instead of List[Char] == then 'Terminated due to timeout' error would be raised
  def isSeqCorrect(seq: List[Char], rg: Int = 0, by: Int = 0): Boolean = {
    if (seq.isEmpty) return rg == 0 && by == 0
    seq.head match {
      case 'R' if rg <  1 => isSeqCorrect(seq.tail, rg+1, by)
      case 'G' if rg > -1 => isSeqCorrect(seq.tail, rg-1, by)
      case 'B' if by <  1 => isSeqCorrect(seq.tail, rg, by+1)
      case 'Y' if by > -1 => isSeqCorrect(seq.tail, rg, by-1)
      case _ => false
    }
  }

//  def isSeqCorrectWithoutRecursion(seq: String): String = {
//    var rg, by = 0
//
//    for (ch <- seq) {
//      ch match {
//        case 'R' if rg < 1 => rg += 1
//        case 'G' if rg > -1 => rg -= 1
//        case 'B' if by < 1 => by += 1
//        case 'Y' if by > -1 => by -= 1
//        case _ => return "False"
//      }
//    }
//    if (rg == 0 && by == 0) "True" else "False"
//  }
}
