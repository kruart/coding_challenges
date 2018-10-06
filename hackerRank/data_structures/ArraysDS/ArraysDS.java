package data_structures.ArraysDS;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/arrays-ds/problem
public class ArraysDS {

    static int[] reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 4, 3, 2})));    //2, 3, 4, 1
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 4, 5, 3, 2})));    //2, 3, 5, 4, 1
    }
}
