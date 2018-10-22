package algorithms.AngryProfessor;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/angry-professor/problem
public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        return k > Arrays.stream(a).filter(i -> i <= 0).count() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2})); //YES
        System.out.println(angryProfessor(2, new int[]{0, -1, 2, 1}));  //NO
    }
}
