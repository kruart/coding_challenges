package algorithms.Staircase

// https://www.hackerrank.com/challenges/staircase/problem
static void staircase(int n) {
    (1..n).each() {
        println(("#"*it).padLeft(n))
    }
}

staircase(6)
staircase(15)