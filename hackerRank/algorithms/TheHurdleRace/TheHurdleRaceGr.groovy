package algorithms.TheHurdleRace

import static java.lang.System.in

// https://www.hackerrank.com/challenges/the-hurdle-race/problem
static int hurdleRace(k, List height) {
    return k - height.max() >= 0 ? 0 : height.max() - k
}

def nk = in.newReader().readLine().split(" ")
def n = nk[0].toInteger()
def k = nk[1].toInteger()

def height = in.newReader().readLine().split(" ").collect({it as int})
println(hurdleRace(k, height))


