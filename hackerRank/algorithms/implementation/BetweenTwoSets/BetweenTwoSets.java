package algorithms.implementation.BetweenTwoSets;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/between-two-sets/problem
public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        int totalX = 0;
        for (int i = 1; i <= 100; i++) {
            boolean isFactor = true;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    isFactor = false;
                    break;
                }
            }
            for (int j = 0; j < b.length; j++) {
                if (!isFactor || b[j] % i != 0) {
                    isFactor = false;
                    break;
                }
            }
            if (isFactor) totalX++;
        }
        return totalX;
    }

    static int getTotalX2(int[] a, int[] b) {
        int totalX = 0;
        for (int i = 1; i <= 100; i++) {
            int finalI = i;
            boolean aIsFactor = !Arrays.stream(a).anyMatch(n -> finalI % n != 0);
            boolean bIsFactor = !Arrays.stream(b).anyMatch(n -> n % finalI != 0);

            if (aIsFactor && bIsFactor) totalX++;
        }
        return totalX;
    }

    public static void main(String[] args) {
        System.out.println(getTotalX(new int[]{2, 4}, new int[]{16, 32, 96}));          //3
        System.out.println(getTotalX(new int[]{3, 4}, new int[]{24, 48}));              //2
        System.out.println(getTotalX(new int[]{2, 6}, new int[]{24, 36}));              //2
        System.out.println(getTotalX(new int[]{1, 1}, new int[]{1, 1}));                //1
        System.out.println(getTotalX(new int[]{100, 100}, new int[]{100, 100, 100}));   //1

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(getTotalX2(new int[]{2, 4}, new int[]{16, 32, 96}));         //3
        System.out.println(getTotalX2(new int[]{3, 4}, new int[]{24, 48}));             //2
        System.out.println(getTotalX2(new int[]{2, 6}, new int[]{24, 36}));             //2
        System.out.println(getTotalX2(new int[]{1, 1}, new int[]{1, 1}));               //1
        System.out.println(getTotalX2(new int[]{100, 100}, new int[]{100, 100, 100}));  //1
    }
}
