package algorithms.FibonacciModified

// https://www.hackerrank.com/challenges/fibonacci-modified/problem
def sc = new Scanner(System.in)
def (t1, t2, n) = sc.nextLine().split(" ")*.toInteger()
println(fibonacciModified(t1, t2, n))

static BigInteger fibonacciModified(int t1, int t2, int n) {
    def ts = [BigInteger.valueOf(t1), BigInteger.valueOf(t2)]

    (2..n-1).each { ts[it] = ts[it-2]  + ts[it-1].pow(2) }
    ts.last()
}
