package practiceProblems.Arrays

static void printallSubarrays(List<Integer> arr) {
    def m = [0:[-1]]  // Map<Integer, List<Integer>>
    int sum = 0

    arr.eachWithIndex{ item, i ->
        sum += item

        if (m.containsKey(sum)) {
            m.get(sum).each { value -> println("subarray [${value + 1}..${i}]") }
        }
        m[sum] = m.getOrDefault(sum, []) + i
    }
}

printallSubarrays([3, 4, -7, 3, 1, 3, 1, -4, -2, -2])
// 3, 4, -7, 3, 1, 3, 1, -4, -2, -2
// 3, 7,  0, 3, 4, 7, 8,  4,  2,  0    = sum
// [0..2]
// [1..3]
// [2..5]
// [5..7]
// [0..9]
// [3..9]