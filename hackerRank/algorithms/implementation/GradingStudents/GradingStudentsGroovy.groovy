package algorithms.implementation.GradingStudents

// https://www.hackerrank.com/challenges/grading/problem
static def gradingStudents(grades) {
    grades.collect({(it >= 38 && it % 5 > 2) ? it - (it % 5) + 5 : it})
}

println(gradingStudents([73, 67, 38, 33]))