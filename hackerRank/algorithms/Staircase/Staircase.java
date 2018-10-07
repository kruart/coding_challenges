package algorithms.Staircase;

// https://www.hackerrank.com/challenges/staircase/problem
public class Staircase {
    static void staircase(int n) {
        String str = "";
        for (int i = 1; i <= n; i++) {
            str += "#";
            System.out.println(String.format("%" + n + "s", str));
        }
    }

    public static void main(String[] args) {
        staircase(6);
        staircase(15);
    }
}
