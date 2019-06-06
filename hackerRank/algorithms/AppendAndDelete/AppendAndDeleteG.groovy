package algorithms.AppendAndDelete

// https://www.hackerrank.com/challenges/append-and-delete/problem
def sc = new Scanner(System.in)
def (s, t, k) = [sc.nextLine(), sc.nextLine(), sc.nextInt()]
println(appendAndDelete(s, t, k))

static String appendAndDelete(String s, String t, int k) {
    int totalLength = s.length() + t. length()
    if (k >= totalLength) return "Yes"

    int sameLength = 0
    (0..Math.min(s.length(), t.length()) - 1).any { i ->
        if (s[i] != t[i]) return true   // break
        sameLength++
        return // continue
    }
    int diff = totalLength - 2*sameLength
    if (k >= diff && (k - diff) % 2 == 0) "Yes"
    else "No"
}
