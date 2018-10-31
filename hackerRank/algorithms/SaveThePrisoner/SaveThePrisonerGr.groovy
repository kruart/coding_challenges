package algorithms.SaveThePrisoner

// https://www.hackerrank.com/challenges/save-the-prisoner/problem
def static saveThePrisoner(int n, int m, int s) {
    (m - 1 + s) % n ?: n
}


def sc = new Scanner(System.in)
def n = sc.nextInt()
sc.nextLine()
(1..n).forEach({
    println(saveThePrisoner(*sc.nextLine().split(" ").collect({it.toInteger()})))
})


