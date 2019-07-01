package data_structures.Qheap1;

import java.util.PriorityQueue;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/qheap1/problem
public class Qheap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        PriorityQueue<Integer> qq = new PriorityQueue<>(q);

        while (q-- != 0) {
            int v1 = sc.nextInt();
            if (v1 == 1) qq.add(sc.nextInt());
            else if (v1 == 2) qq.remove(sc.nextInt());
            else if (v1 == 3) System.out.println(qq.peek());
        }
    }
}
