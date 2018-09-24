package java_;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/valid-username-checker/problem

/**
 * - username must contains only [a-zA-Z_0-9]
 * - consists of 8 to 30 chars inclusive
 * - starts with alphabetic character [a-zA-Z]
 */
public class ValidUsernameRegEx {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());  // number of attempts
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z]([\\w]){7,29}$";
}
