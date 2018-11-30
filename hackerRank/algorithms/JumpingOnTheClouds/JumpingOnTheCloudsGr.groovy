package algorithms.JumpingOnTheClouds

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
static def jumpingOnClouds(List clouds) {
    def jumps = 1
    for (int i = 2; i < clouds.size() - 1; i += 2) {
        if (clouds[i] != 0) i--
        jumps++
    }
    jumps
}

def sc = new Scanner(System.in)
def n = sc.nextLine()
def arr = sc.nextLine().split(" ")*.toInteger()
println(jumpingOnClouds(arr))