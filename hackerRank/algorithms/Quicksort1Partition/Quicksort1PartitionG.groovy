package algorithms.Quicksort1Partition

// https://www.hackerrank.com/challenges/quicksort1/problem
def quickSort(List nums) {
    if (nums.size() <= 1) return nums

    def pivot = nums.head()
    def left = []
    def right = []

    nums.tail().forEach {
        it < pivot ? left.add(it) : right.add(it)
    }
    left + pivot + right
}

Scanner scanner = new Scanner(System.in)
def n = scanner.nextLine() as Integer
def nums = scanner.nextLine()
        .split(" ")
        .collect{it.toInteger()}
println(quickSort(nums).join(" "))