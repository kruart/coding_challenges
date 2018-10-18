package data_structures.ArraysDS

// https://www.hackerrank.com/challenges/arrays-ds/problem
static int[] reverseArray(a) {
    return a[-1..0]
}

println(reverseArray([1, 4, 5, 3, 2]))  // 2, 3, 5, 4, 1
println(reverseArray([1, 4, 3, 2]))     // 2, 3, 4, 1


