package algorithms.AppleAndOrange

object AppleAndOrangeSc extends App {
  def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {
    println(apples.count(v => a + v >= s && a + v <= t))
    println(oranges.count(v => b + v >= s && b + v <= t))
  }
  countApplesAndOranges(7, 11, 5, 15, Array(-2, 2, 1), Array(5, -6))  //1 1
}
