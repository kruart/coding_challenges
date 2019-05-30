package Arrays;

import java.util.Arrays;

public class SortBinaryArrayInLinearTime {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{0, 1, 0, 1, 0, 1, 0, 1})));
        System.out.println(Arrays.toString(sort(new int[]{0, 0, 1, 1, 0, 1, 0, 1})));
        System.out.println(Arrays.toString(sort(new int[]{1, 1, 1, 1, 0, 0, 0, 0})));
        System.out.println(Arrays.toString(sort(new int[]{1, 0, 1, 0, 1, 0, 1, 0})));
    }

    private static int[] sort(int[] arr) {
        int j = 0;  // tracking last index for 1 value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }
}
