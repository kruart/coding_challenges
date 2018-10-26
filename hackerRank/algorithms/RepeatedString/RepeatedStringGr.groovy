package algorithms.RepeatedString

def static repeatedString(String s, Long n) {
    def countA = s.count('a')
    def factor = (long) (n / s.length())
    def remainder = n % s.length()
    countA = countA * factor

    for (def i = 0; i < remainder; i++)
        if (s[i] == 'a') countA++

    return countA
}


def sc = new Scanner(System.in)
def s = sc.nextLine()
def n = sc.nextLong()
println(repeatedString(s, n))
sc.close()
