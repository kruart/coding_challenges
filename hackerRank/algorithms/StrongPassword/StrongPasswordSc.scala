package algorithms.StrongPassword

// https://www.hackerrank.com/challenges/strong-password/problem
object StrongPasswordSc {
  //way 1
  def minimumNumber(n: Int, password: String): Int = {
    val b: Array[Boolean] = Array.fill(4)(false)

    password.foreach(ch => {
      if (ch.isLower) b(0) = true
      if (ch.isUpper) b(1) = true
      if (ch.isDigit) b(2) = true
      if (!ch.isLower && !ch.isUpper && !ch.isDigit) b(3) = true
    })
    math.max(b.count(!_), 6 - n)
  }

  //way 2
  def minimumNumber2(n: Int, password: String): Int = {
    val c = Array(".*[a-z].*", ".*[A-Z].*", ".*[0-9].*", ".*\\W.*")
      .count(!password.matches(_))
    math.max(c, 6 - n)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val (n, password) = (stdin.readInt, stdin.readLine)

    println(minimumNumber(n, password))
//    println(minimumNumber2(n, password))
  }
}
