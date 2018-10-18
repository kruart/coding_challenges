package algorithms.BetweenTwoSets

// https://www.hackerrank.com/challenges/between-two-sets/problem
object BetweenTwoSetsSc extends App {
  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    (a.max to b.min).count(i => {
      a.forall(i%_==0) && b.forall(_%i==0)
    })
  }

  println(getTotalX(Array(2, 4), Array(16, 32, 96)));          //3
  println(getTotalX(Array(3, 4), Array(24, 48)));              //2
  println(getTotalX(Array(2, 6), Array(24, 36)));              //2
  println(getTotalX(Array(1, 1), Array(1, 1)));                //1
  println(getTotalX(Array(100, 100), Array(100, 100, 100)));   //1
}
