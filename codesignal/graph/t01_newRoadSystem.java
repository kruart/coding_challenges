package graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class t01_newRoadSystem {
    boolean newRoadSystem(boolean[][] roadRegister) {
        int[] arr = new int[roadRegister[0].length];
        for (int i = 0; i < roadRegister.length; i++) {
            for (int j = 0; j < roadRegister[0].length; j++) {
                if (roadRegister[i][j]) {
                    arr[i]++;
                    arr[j]--;
                }
            }
        }
        return Arrays.stream(arr).allMatch(i -> i == 0);
    }

    public static void main(String[] args) {
        t01_newRoadSystem m = new t01_newRoadSystem();
        System.out.println(m.newRoadSystem(new boolean[][]{
                {false, true,  false, false},
                {false, false, true,  false},
                {true,  false, false, true },
                {false, false, true,  false}
        }));
    }
}
