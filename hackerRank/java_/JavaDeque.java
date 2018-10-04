package java_;

import java.util.*;

// https://www.hackerrank.com/challenges/java-dequeue/problem
public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueElems = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int maxUniqueNums = -1;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            uniqueElems.add(num);

            if (deque.size() == m) {
                if (uniqueElems.size() > maxUniqueNums) maxUniqueNums = uniqueElems.size();

                Integer firstElem = deque.removeFirst();
                if (!deque.contains(firstElem)) {
                    uniqueElems.remove(firstElem);
                }
            }
        }
        System.out.println(maxUniqueNums);
    }
}
