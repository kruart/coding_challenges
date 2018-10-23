package algorithms.BeautifulDaysAtTheMovies

// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
object BeautifulDaysAtTheMoviesSc extends App {
  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    (i to j).count(n => (n - n.toString.reverse.toInt) % k == 0)
  }

  println(beautifulDays(20, 23, 6)) //2
}
