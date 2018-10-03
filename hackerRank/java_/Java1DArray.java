package java_;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/java-1d-array/problem
public class Java1DArray {
    public static boolean canWin(int leap, int[] game) {
        if (game == null || game[0] == 1) return false;
        int n = game.length;

        Stack<Integer> possibleIndices = new Stack<>();
        possibleIndices.push(0);

        while (!possibleIndices.isEmpty()) {
            int i = possibleIndices.pop();

            if (i >= n) return true;    //check if i is out of array bounds
            if (i < 0 || game[i] == 1) continue;    //if i is negative or equals to 1

            game[i] = 1; //set flag, we've already visited that index

            // push all possible indexes
            possibleIndices.push(i-1);
            possibleIndices.push(i+1);
            possibleIndices.push(i+leap);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
