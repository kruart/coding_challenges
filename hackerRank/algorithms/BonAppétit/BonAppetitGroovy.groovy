package algorithms.BonAppétit

// https://www.hackerrank.com/challenges/bon-appetit/problem
static def bonAppetit(List<Integer> bill, int k, int b) {
    def sum = (bill.sum() - bill[k]) / 2
    println(sum == b ? "Bon Appetit" : b - sum)
}

def bill = [3, 10, 2, 9]
bonAppetit(bill, 1, 12)  //5
bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7)   //Bon Appetit
