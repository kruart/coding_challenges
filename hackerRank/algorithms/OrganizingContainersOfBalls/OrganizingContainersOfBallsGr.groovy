package algorithms.OrganizingContainersOfBalls

static organizingContainers(List<List<Integer>> container){
    def rowsSum = container.collect{ it.sum() }.sort()
    def colsSum = container.transpose().collect{ it.sum() }.sort()
    rowsSum == colsSum ? "Possible" : "Impossible"
}

def sc = new Scanner(System.in)
def q = sc.nextInt()

q.times {
    def n = sc.nextInt()
    sc.nextLine()
    def container = (1..n).collect {sc.nextLine().split(" ")*.toInteger()}  //list of lists
    println(organizingContainers(container))
}
