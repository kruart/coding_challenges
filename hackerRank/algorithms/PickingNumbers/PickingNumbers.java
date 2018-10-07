package algorithms.PickingNumbers;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/picking-numbers/problem
public class PickingNumbers {

    static final int LIMIT = 100;

    static int pickingNumbers(int[] a) {
        int[] range = new int[LIMIT];

        for (int num : a) {
            range[num]++;
        }

        int result = Arrays.stream(range).max().getAsInt();

        for (int i = 1; i < range.length; i++) {
            result = Math.max(result, range[i - 1] + range[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(new int[]{4, 6, 5, 3, 3, 1}));    //3
        System.out.println(pickingNumbers(new int[]{1, 2, 2, 3, 1, 2}));    //5
        System.out.println(pickingNumbers(new int[]{1, 1, 2, 2, 4, 4, 5, 5, 5}));    //5
        System.out.println(pickingNumbers(new int[]{
                7, 12, 13, 19, 17, 7, 3, 18, 9, 18, 13, 12, 3, 13, 7, 9, 18, 9, 18, 9,
                13, 18, 13, 13, 18, 18, 17, 17, 13, 3, 12, 13, 19, 17, 19, 12, 18, 13, 7, 3,
                3, 12, 7, 13, 7, 3, 17, 9, 13, 13, 13, 12, 18, 18, 9, 7, 19, 17, 13, 18,
                19, 9, 18, 18, 18, 19, 17, 7, 12, 3, 13, 19, 12, 3, 9, 17, 13, 19, 12, 18,
                13, 18, 18, 18, 17, 13, 3, 18, 19, 7, 12, 9, 18, 3, 13, 13, 9, 7
        }));    //30
    }
}
