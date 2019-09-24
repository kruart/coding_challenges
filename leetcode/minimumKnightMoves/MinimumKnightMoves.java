package minimumKnightMoves;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumKnightMoves {
    public int minKnightMoves(int x, int y) {
        int[][] directions = new int[][] {{-1, 2}, {1, 2}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {2, -1}, {2, 1}};
        int moves = 0;
        x = Math.abs(x) + 300;
        y = Math.abs(y) + 300;
        boolean[][] dp = new boolean[601][601];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {300, 300});
        dp[300][300] = true;    // 0, 0

        while (!q.isEmpty()) {
            int N = q.size();

            for (int i = 0; i < N; i++) {
                int[] p = q.poll();
                if (x == p[0] && y == p[1]) return moves;

                for (int[] dir : directions) {
                    int[] m = new int[] {p[0] + dir[0], p[1] + dir[1]};
                    if (m[0] >= 0 && m[0] <= 600 && m[1] >= 0 && m[1] <= 600 && !dp[m[0]][m[1]]) {
                        q.add(m);
                        dp[m[0]][m[1]] = true;
                    }
                }
            }
            moves++;
        }

        return moves;
    }
}
