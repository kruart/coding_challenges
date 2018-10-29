package algorithms.SequenceEquation

// https://www.hackerrank.com/challenges/permutation-equation/problem
object SequenceEquationSc extends App {
  def permutationEquation(p: Array[Int]): Array[Int] = {
    val m = (1 to p.length).map(i => p(i-1) -> i).toMap
    (1 to p.length).map(i => m(m(i))).toArray
  }

  permutationEquation(Array(2, 3, 1)).foreach(println)        //2 3 1
  permutationEquation(Array(4, 3, 5, 1, 2)).foreach(println)  //1 3 5 4 2
  permutationEquation(Array(5, 2, 1, 3, 4)).foreach(println)  //4 2 5 1 3
}
