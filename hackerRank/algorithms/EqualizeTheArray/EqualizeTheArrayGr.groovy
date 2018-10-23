package algorithms.EqualizeTheArray

// https://www.hackerrank.com/challenges/equality-in-a-array/problem
def static equalizeArray(List arr) {
    return arr.size() - arr.groupBy({it}).collect({it.value.size()}).max()
}

Scanner sc = new Scanner(System.in)
def n = Integer.parseInt(sc.nextLine())
def arr = sc.nextLine().split(" ").collect({it.toInteger()})

println(equalizeArray(arr)) // 2
