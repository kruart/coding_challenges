package algorithms.StrongPassword;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

// https://www.hackerrank.com/challenges/strong-password/problem
public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println(minimumNumber(n, sc.nextLine()));
//        System.out.println(minimumNumber2(n, sc.nextLine()));
    }

    //way 1
    private static int minimumNumber(int n, String password) {
        Boolean [] criteria = new Boolean[]{false, false, false, false};

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) criteria[0] = true;
            if (Character.isUpperCase(c)) criteria[1] = true;
            if (Character.isDigit(c)) criteria[2] = true;
            if (!Character.isLowerCase(c) && !Character.isUpperCase(c) && !Character.isDigit(c)) criteria[3] = true;
        }

        //count not satisfied
        int count = (int)Arrays.stream(criteria).filter(c -> !c).count();
        return Math.max(count, 6 - n);
    }

    //way 2
    private static int minimumNumber2(int n, String password) {
        int c = (int) Stream.of(".*[a-z].*", ".*[A-Z].*", ".*[0-9].*", ".*\\W.*")
                .filter(i -> !password.matches(i))
                .count();
        return Math.max(c, 6 - n);
    }
}
