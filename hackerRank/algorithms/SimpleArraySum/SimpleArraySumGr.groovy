package algorithms.SimpleArraySum

static simpleArraySum(List<Integer> arr) {
    arr.sum()
}

def sc = new Scanner(System.in)
def (n, arr) = [sc.nextLine(), sc.nextLine().split()*.toInteger()]
println(simpleArraySum(arr))

