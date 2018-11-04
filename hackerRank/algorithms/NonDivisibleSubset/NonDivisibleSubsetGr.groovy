package algorithms.NonDivisibleSubset

import static java.lang.Math.max
import static java.lang.Math.min

def sc = new Scanner(System.in)
def n = sc.nextInt()
def k = sc.nextInt()

def l = (1..n).collect({sc.nextInt()})
println(nonDivisibleSubset(k, l))

def static nonDivisibleSubset(int k, List S) {
    def l = [0]*k
    S.forEach({l[it % k]++})

    def count = (1..k/2).inject(min(l[0], 1), { acc, v -> v != k-v ? acc + max(l[v], l[k-v]) : acc})
    return k % 2==0 ? count+1 : count
}
