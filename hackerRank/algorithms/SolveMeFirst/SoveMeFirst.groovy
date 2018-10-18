package algorithms.SolveMeFirst

import jline.internal.InputStreamReader

// https://www.hackerrank.com/challenges/solve-me-first/problem
def br = new BufferedReader(new InputStreamReader(System.in))
def a = Integer.parseInt(br.readLine())
def b = Integer.parseInt(br.readLine())

println solveMeFirst(a, b)

static def solveMeFirst(a, b) {
    a + b
}
