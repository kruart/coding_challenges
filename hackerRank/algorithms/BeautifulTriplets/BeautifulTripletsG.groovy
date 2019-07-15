package algorithms.BeautifulTriplets

// https://www.hackerrank.com/challenges/beautiful-triplets/problem
def triplets(int d, List<Integer> arr) {
    arr.count{ it+d in arr && it+d*2 in arr}
}

def sc = new Scanner(System.in)
def (int n, int d) = sc.nextLine().split()*.toInteger()
List<Integer> ll = (1..n).collect { sc.nextInt() }
println(triplets(d, ll))