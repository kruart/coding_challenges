package algorithms.ThePowerSum

def powerSum(int X, int N, int num = 1) {
    def numToN = (int) Math.pow(num, N)
    if (numToN > X) 0
    else if (numToN == X) 1
    else powerSum(X, N, num+1) + powerSum(X-numToN, N, num+1)
}

def sc = new Scanner(System.in)
println(powerSum(sc.nextInt(), sc.nextInt()))
