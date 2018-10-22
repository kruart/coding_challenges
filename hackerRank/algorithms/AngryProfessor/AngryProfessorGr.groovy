package algorithms.AngryProfessor

// https://www.hackerrank.com/challenges/angry-professor/problem
def static angryProfessor(k, List a) {
    return k > a.count({it <= 0}) ? "YES" : "NO"
}

println(angryProfessor(3, [-1, -3, 4, 2])) //YES
println(angryProfessor(2, [0, -1, 2, 1]))  //NO
