package algorithms.implementation.Kangaroo;

// https://www.hackerrank.com/challenges/kangaroo/problem
public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int diff = Math.abs(x1 - x2);

        while (diff != 0) {
            x1 += v1;
            x2 += v2;

            if (Math.abs(x1 - x2) >= diff || x1 == x2) {
               break;
            }
            diff = Math.abs(x1 - x2);
        }
        return x1 - x2 == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));   //YES
        System.out.println(kangaroo(0, 2, 5, 3));   //NO
        System.out.println(kangaroo(43, 2, 70, 2)); //NO
    }
}
