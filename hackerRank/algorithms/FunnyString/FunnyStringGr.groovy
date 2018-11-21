package algorithms.FunnyString

// https://www.hackerrank.com/challenges/funny-string/problem
static String funnyString(String s) {
    (1..s.length()-1).toList().every { i ->
        int diff1 = Math.abs(s.charAt(i-1) - s.charAt(i)) //from the left
        int diff2 = Math.abs(s.charAt(s.length() - i) - s.charAt(s.length() - i - 1)) //from the right
        diff1 == diff2
    } ? "Funny" : "Not Funny"
}

def sc = new Scanner(System.in)
def n = sc.nextLine() as Integer

n.times { println(funnyString(sc.nextLine())) }


