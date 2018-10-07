package algorithms.BreakingTheRecords

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
static breakingRecords(List scores) {
    int max = scores[0]
    int min = scores[0]
    int countMaxRecords = 0
    int countMinRecords = 0

    scores.each {
        if (it > max) {
            max = it
            countMaxRecords++
        } else if (it < min) {
            min = it
            countMinRecords++
        }
    }
    return [countMaxRecords, countMinRecords]
}

println(breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1]))       //2 4
println(breakingRecords([3, 4, 21, 36, 10, 28, 35, 5, 24, 42])) //4 0
println(breakingRecords([12, 24, 10, 24])) //1 1
