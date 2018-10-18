package algorithms.SimpleArraySum;
import java.util.Arrays;

// https://www.hackerrank.com/challenges/simple-array-sum/problem
public class SimpleArraySum  {
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        System.out.println(simpleArraySum(new int[]{1, 2, 3}));             //6
        System.out.println(simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));  //31
        System.out.println(simpleArraySum(new int[]{5, 2, 1, 4, 73, 25}));  //110
    }
}
