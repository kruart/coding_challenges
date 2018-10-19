package algorithms.ClimbingTheLeaderBoard;

import java.util.*;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
public class ClimbingTheLeaderBoard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] places = new int[alice.length];
        List<Integer> distinctScores = Arrays.stream(scores)    //unique scores
                .distinct().boxed().collect(Collectors.toList());

        int currentPlace = distinctScores.size();
        for (int i = 0; i < alice.length; i++) {
            for (int j = currentPlace - 1; j >= 0; j--) {   //start from previous position
                if (alice[i] >= distinctScores.get(j)) currentPlace--;
                else break;
            }
            places[i] = currentPlace+1;
        }
        return places;
    }

    public static void main(String[] args) {
        int[] result1 = climbingLeaderboard(new int[]{100, 90, 90, 80}, new int[]{70, 80, 105});                    //4 3 1
        int[] result2 = climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});    //6 4 2 1
        int[] result3 = climbingLeaderboard(new int[]{100, 90, 90, 80, 75, 60}, new int[]{50, 65, 77, 90, 102});    //6 5 4 2 1

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
