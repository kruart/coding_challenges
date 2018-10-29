package algorithms.ThePowerSum;

// https://www.hackerrank.com/challenges/the-power-sum/problem
public class ThePowerSum {
    static int powerSum(int X, int N, int num) {
        int numToN = (int) Math.pow(num, N);

        if (numToN > X) return 0;
        else if (numToN == X) return 1;
        else return (powerSum(X, N, num + 1) + powerSum(X - numToN, N, num + 1));
    }

    public static void main(String[] args) {
        System.out.println(powerSum(10, 2, 1));     //1
        System.out.println(powerSum(100, 2, 1));    //3
    }
}
