package algorithms.PlusMinus

// https://www.hackerrank.com/challenges/plus-minus/problem
static plusMinus(List l) {
    def m = l.countBy { 1 + (it >> 31) - (-it >> 31) }
    println((m[2] ?: 0F) / l.size)  //2 = > 0
    println((m[0] ?: 0F) / l.size)  //0 = < 0
    println((m[1] ?: 0F) / l.size)  //1 is 0
}

def sc = new Scanner(System.in)
def n = sc.nextLine()
def arr = sc.nextLine().split()*.toInteger()
plusMinus(arr)

