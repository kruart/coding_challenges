package algorithms.ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
       BigInteger fac = new BigInteger("1");
        for (int i = 2; i < n+1; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        extraLongFactorials(n);
        scanner.close();
    }
}
