package java_;

import java.util.BitSet;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-bitset/problem
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet[] sets = {new BitSet(n), new BitSet(n)};

        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            int left = sc.nextInt();
            int rigth = sc.nextInt();

            switch (operation) {
                case "AND":
                    sets[left - 1].and(sets[rigth - 1]);
                    break;
                case "OR":
                    sets[left - 1].or(sets[rigth - 1]);
                    break;
                case "XOR":
                    sets[left - 1].xor(sets[rigth - 1]);
                    break;
                case "FLIP":
                    sets[left - 1].flip(rigth);
                    break;
                case "SET":
                    sets[left - 1].set(rigth);
                    break;
            }

            System.out.println(sets[0].cardinality() + " " + sets[1].cardinality());
        }
    }
}
