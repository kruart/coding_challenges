package sortings.mergesort

def mergeSort(List nums) {
    if (nums.size() < 2) {
        return nums
    }

    int length = nums.size()
    int middle = Math.floor(length / 2)
    def left = new LinkedList(nums.subList(0, middle))
    def right = new LinkedList(nums.subList(middle, length))

    def sortedLeft = mergeSort(left)
    def sortedRight = mergeSort(right)
    return stitch(sortedLeft, sortedRight)
}

def stitch(List left, List right) {
    def results = []
    def (size1, size2) = [left.size(), right.size()]

    while (size1 > 0 && size2 > 0) {
        if (left[0] <= right[0]) {
            results.add(left.remove(0))
            size1--
        } else {
            results.add(right.remove(0))
            size2--
        }
    }
//    results += left ?: []   // results.addAll(left)
//    results += right ?: []
    return results + left + right
}

println(mergeSort([7,2,6,17,2]))
println(mergeSort([4,0,-32,-32,-5,-2,6,78,31,3,1]))