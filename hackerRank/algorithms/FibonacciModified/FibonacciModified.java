package algorithms.FibonacciModified;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/fibonacci-modified/problem
public class FibonacciModified {

    static BigInteger fibonacciModified(int t1, int t2, int n) {
        List<BigInteger> ts = new ArrayList<>();
        ts.add(BigInteger.valueOf(t1));
        ts.add(BigInteger.valueOf(t2));

        for (int i = 2; i < n; i++) {
            ts.add(ts.get(i-2).add(ts.get(i-1).pow(2)));
        }
        return ts.get(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);
        int t2 = Integer.parseInt(t1T2n[1]);
        int n = Integer.parseInt(t1T2n[2]);
        System.out.println(fibonacciModified(t1, t2, n));

        scanner.close();
    }
}

