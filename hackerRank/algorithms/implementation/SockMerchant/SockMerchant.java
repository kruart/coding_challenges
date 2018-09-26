package algorithms.implementation.SockMerchant;

import java.util.HashSet;
import java.util.Set;

// https://www.hackerrank.com/challenges/sock-merchant/problem
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> sockPairs = new HashSet<>();
        int pairs = 0;

        for (int item : ar) {
            if (sockPairs.contains(item)) {
                sockPairs.remove(item);
                pairs++;
            } else {
                sockPairs.add(item);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(7, new int[] {1, 2, 1, 2, 1, 3, 2})); //2
        System.out.println(sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20})); //3
    }
}
