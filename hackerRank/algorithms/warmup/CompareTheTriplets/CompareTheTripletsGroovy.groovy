package algorithms.warmup.CompareTheTriplets
//https://www.hackerrank.com/challenges/compare-the-triplets/problem

static def compareTriplets(a, b) {
    def aliceScore = 0
    def bobScore = 0
    a.eachWithIndex({item, index ->
        if (item > b[index]) {
            aliceScore++
        } else if (item < b[index]) {
            bobScore++
        }
    })
    return [aliceScore, bobScore]
}

def aliceRates = [17, 28, 30]
def bobRates = [99, 16, 8]
println(compareTriplets(aliceRates, bobRates))

def aliceRates2 = [5, 6, 7]
def bobRates2 = [3, 6, 10]
println(compareTriplets(aliceRates2, bobRates2))
