package algorithms.BeautifulDaysAtTheMovies


// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
def static beautifulDays(int i, int j, int k) {
    (i..j).count({(it - it.toString().reverse().toInteger()) % k == 0})
}

def args = System.in.newReader().readLine().split(" ").collect({it.toInteger()})
println(beautifulDays(args[0], args[1], args[2]))
