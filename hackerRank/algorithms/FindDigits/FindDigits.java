package algorithms.FindDigits;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/find-digits/problem
public class FindDigits {
    static int findDigits(int n) {
        return (int) Arrays.stream((String.valueOf(n)).split(""))
                .filter(i -> !i.equals("0") && n % Integer.parseInt(i) == 0)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(findDigits(12));     //2
        System.out.println(findDigits(1012));   //3
    }
}
