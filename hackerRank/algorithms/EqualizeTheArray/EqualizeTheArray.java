package algorithms.EqualizeTheArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem
public class EqualizeTheArray {
    static int equalizeArray(int[] arr) {
        return (int) (arr.length - Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .values()
                        .stream()
                        .max(Comparator.naturalOrder()).orElse(0L));
    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{3, 3, 2, 1, 3}));    // 2
    }
}
