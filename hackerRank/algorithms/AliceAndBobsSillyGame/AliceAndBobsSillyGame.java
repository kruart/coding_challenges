package algorithms.AliceAndBobsSillyGame;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/alice-and-bobs-silly-game/problem
public class AliceAndBobsSillyGame {
    static String sillyGame(int n) {
        boolean isAliceMove = true;
        boolean[] sieve = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            if (!sieve[i]) {
                isAliceMove = !isAliceMove;
                for (int j = i; j <= n; j += i) {
                    sieve[j] = true;
                }
            }
        }
        return isAliceMove ? "Bob" : "Alice";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(sillyGame(in.nextInt()));
        }
    }
}
