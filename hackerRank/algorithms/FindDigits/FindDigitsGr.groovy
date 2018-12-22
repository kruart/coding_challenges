package algorithms.FindDigits

static findDigits(int n) {
    n.toString().split("").count {it != "0" && n % Integer.parseInt(it) == 0 }
}

def sc = new Scanner(System.in)
def n = sc.nextInt()

n.times {
    println(findDigits(sc.nextInt()))
}
