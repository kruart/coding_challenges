package algorithms.BetweenTwoSets

// https://www.hackerrank.com/challenges/between-two-sets/problem
static def getTotalX(a, b) {
    def totalX = 0;

    (1..100).each({i ->
        boolean isAFactor = !a.any({num -> i % num != 0})
        boolean isBFactor = !b.any({num -> num % i != 0})

        if (isAFactor && isBFactor) totalX++
    })
    return totalX
}


println(getTotalX([2, 4], [16, 32, 96]));          //3
println(getTotalX([3, 4], [24, 48]));              //2
println(getTotalX([2, 6], [24, 36]));              //2
println(getTotalX([1, 1], [1, 1]));                //1
println(getTotalX([100, 100], [100, 100, 100]));   //1

