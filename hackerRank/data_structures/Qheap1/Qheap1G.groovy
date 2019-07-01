package data_structures.Qheap1

Scanner sc = new Scanner(System.in)
int q = sc.nextInt()
PriorityQueue<Integer> qq = new PriorityQueue<>(q)

while (q-- != 0) {
    int v1 = sc.nextInt()
    if (v1 == 1) qq.add(sc.nextInt())
    else if (v1 == 2) qq.remove(sc.nextInt())
    else if (v1 == 3) println(qq.peek())
}