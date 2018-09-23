package java_;

import java.math.BigInteger;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-primality-test/problem
public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();

        BigInteger num = new BigInteger(n);
        System.out.println(num.isProbablePrime(100) ? "prime" : "not prime");
    }
}
