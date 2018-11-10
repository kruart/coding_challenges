package algorithms.StrongPassword

// https://www.hackerrank.com/challenges/strong-password/problem
// way 1
def static minimumNumber(int n, String password) {
    def b = [false] * 4
    password.toCharArray().each {
        if (it.isLowerCase()) b[0] = true
        if (it.isUpperCase()) b[1] = true
        if (it.isDigit()) b[2] = true
        if (!it.isLowerCase() && !it.isUpperCase() && !it.isDigit()) b[3] = true
    }

    return Math.max(b.count{!it}, 6-n)
}

//way 2
def static minimumNumber2(int n, String password) {
    def c = [/.*[a-z].*/, /.*[A-Z].*/, /.*[0-9].*/, /.*\W.*/]
            .count{!password.matches(it)}   //or .count{!(password ==~ it)}
    return Math.max(c, 6-n)
}

def sc = new Scanner(System.in)
def n = sc.nextLine().trim().toInteger()
def password = sc.nextLine()
println(minimumNumber(n, password))
//println(minimumNumber2(n, password))


