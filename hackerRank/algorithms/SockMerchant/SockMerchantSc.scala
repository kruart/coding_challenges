package algorithms.SockMerchant

object SockMerchantSc  {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    //way 1
    //ar.groupBy(identity).mapValues(_.length).values.map(_ / 2).sum

    //way 2
    val pairSet = scala.collection.mutable.Set[Int]()
    var pairs = 0

    ar.foreach(i => {
      if (pairSet.contains(i)) {
        pairSet.remove(i)
        pairs += 1
      } else {
        pairSet.add(i)
      }
    })
    pairs
  }

  def main(args: Array[String]) {
    println(sockMerchant(7, Array(1, 2, 1, 2, 1, 3, 2)))    //2
    println(sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20)))
  }
}
