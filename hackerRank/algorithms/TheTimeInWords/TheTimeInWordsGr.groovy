package algorithms.TheTimeInWords

class solution {
    def static numMatch = [
            1: "one", 2: "two", 3: "three", 4: "four", 5: "five", 6: "six",
            7: "seven", 8: "eight", 9: "nine", 10: "ten", 11: "eleven",
            12: "twelve", 13: "thirteen", 14: "fourteen", 15: "fifteen",
            16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen",
            20: "twenty", 21: "twenty one", 22: "twenty two", 23: "twenty three",
            24: "twenty four", 25: "twenty five", 26: "twenty six",
            27: "twenty seven", 28: "twenty eight", 29: "twenty nine"
    ]

    def static timeInWords(Integer h, Integer m) {
        switch (m) {
            case 0: "${numMatch[h]} o' clock"; break
            case 15: "quarter past ${numMatch[h]}"; break;
            case 30: "half past ${numMatch[h]}"; break;
            case 45: "quarter to ${numMatch[h+1]}"; break;
            case {it < 30}: "${numMatch[m]} ${if (m == 1) "minute" else "minutes"} past ${numMatch[h]}"; break
            case {it > 30}: "${numMatch[60 % m]} minutes to ${numMatch[h+1]}"; break
        }
    }

    public static void main(String[] args) {
        def sc = new Scanner(System.in)
        def h = sc.nextInt()
        def m = sc.nextInt()

        println(timeInWords(h, m))
    }
}
