package algorithms.ExtraLongFactorials


static void extraLongFactorials(int n) {
    def fac = (2G..n).inject(1, {acc, value -> acc*value})
    println(fac)
}

def n = System.in.newReader().readLine() as Integer
extraLongFactorials(n)

