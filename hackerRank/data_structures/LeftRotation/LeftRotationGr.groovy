package data_structures.LeftRotation

// https://www.hackerrank.com/challenges/array-left-rotation/problem
def nd = System.in.newReader().readLine().split(" ")
def n = nd[0]
def d = nd[1].toInteger()

def ar = System.in.newReader().readLine().split(" ")
def rotatedArr = ar.takeRight(ar.size()-d) + ar.take(d)
println(rotatedArr.join(" "))
