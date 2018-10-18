package algorithms.AppleAndOrange

// https://www.hackerrank.com/challenges/apple-and-orange/problem
static def countApplesAndOranges(int s, int t, int a, int b, apples, oranges) {
    println(apples.count({a + it >= s && a + it <= t}))
    println(oranges.count({b + it >= s && b + it <= t}))
}

countApplesAndOranges(7, 11, 5, 15, [-2, 2, 1], [5, -6])  // 1 1
