package java_;

import java.util.InputMismatchException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
