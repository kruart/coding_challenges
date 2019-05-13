package sortings.quicksort

def quickSort(List nums) {
    if (nums.size() <= 1) return nums

    def pivot = nums.last()
    def left = []
    def right = []

    nums.init().forEach {
        it < pivot ? left.add(it) : right.add(it)
    }
    return quickSort(left) + pivot + quickSort(right)
}

println(quickSort([5, 9, 6, 4, 10, 7, 1, 8, 3, 2]))
println(quickSort([2, -3, 0, -4, 3, 5, -2, 1, 4, -1, -5]))