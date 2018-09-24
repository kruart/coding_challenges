package algorithms.search.IceCreamParlor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.hackerrank.com/challenges/icecream-parlor/problem
public class IceCreamParlor {

    static int[] icecreamParlor(int m, int[] arr) {
        int[] indices = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isIndicesFound = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (i == j) {/*NOP*/}
                else if (arr[i] + arr[j] == m) {
                    indices[0] = i+1;
                    indices[1] = j+1;
                    isIndicesFound = true;
                    break;
                }
            }
            if (isIndicesFound) break;
        }
        Arrays.sort(indices);
        return indices;
    }

    static int[] icecreamParlor2(int m, int arr[]){
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 1);

        for (int i = 1; i < arr.length; i++) {
            Integer idx = map.get(m - arr[i]);

            if (idx == null) map.put(arr[i], i + 1);
            else {
                indices[0] = idx;
                indices[1] = i + 1;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] arr1 = icecreamParlor(4, new int[]{1, 4, 5, 3, 2});       //[1, 4]
        int[] arr2 = icecreamParlor(4, new int[]{2, 2, 4, 3});          //[1, 2]
        int[] arr3 = icecreamParlor(9, new int[]{1, 3, 4, 6, 7, 9});    //[2, 4]
        int[] arr4 = icecreamParlor(8, new int[]{1, 3, 4, 4, 6, 8});    //[3, 4]
        int[] arr5 = icecreamParlor(3, new int[]{1, 2});                //[1, 2]

        System.out.println("--------------------way 1----------------------");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = icecreamParlor2(4, new int[]{1, 4, 5, 3, 2});       //[1, 4]
        int[] arr7 = icecreamParlor2(4, new int[]{2, 2, 4, 3});          //[1, 2]
        int[] arr8 = icecreamParlor2(9, new int[]{1, 3, 4, 6, 7, 9});    //[2, 4]
        int[] arr9 = icecreamParlor2(8, new int[]{1, 3, 4, 4, 6, 8});    //[3, 4]
        int[] arr10 = icecreamParlor2(3, new int[]{1, 2});               //[1, 2]

        System.out.println("--------------------way 2----------------------");
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.toString(arr9));
        System.out.println(Arrays.toString(arr10));
    }

}
