package cutOffTreesForGolfEvent;

import java.util.*;

// https://leetcode.com/problems/cut-off-trees-for-golf-event/
public class CutOffTreesForGolfEvent {
    int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int cutOffTree(List<List<Integer>> forest) {
        int N = forest.size();
        int M = forest.get(0).size();
        PriorityQueue<int[]> q = getSortedPointsByHeight(forest, N, M);

        int sum = 0;
        int[] start = new int[]{0,0};
        while (!q.isEmpty()) {
            int[] tree = q.poll();
            int steps = stepsToTree(forest, start, tree, N, M);

            if (steps == -1) return -1;
            sum += steps;
            start[0] = tree[0];
            start[1] = tree[1];
        }

        return sum;
    }

    private PriorityQueue<int[]> getSortedPointsByHeight(List<List<Integer>> forest, int n, int m) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(p -> p[2]));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int field = forest.get(i).get(j);
                if (field > 1) q.add(new int[]{i, j, field});
            }
        }
        return q;
    }

    private int stepsToTree(List<List<Integer>> forest, int[] start, int[] target, int N, int M) {
        int steps = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        q.add(start);
        visited[start[0]][start[1]] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] points = q.poll();

                if (points[0] == target[0] && points[1] == target[1]) return steps;

                for (int[] dir : directions) {
                    int row = points[0] + dir[0];
                    int col = points[1] + dir[1];

                    // if out of range or already has been visited or equals to 0 (obstacle)
                    if (row < 0 || row >= N || col < 0 || col >= M || visited[row][col] || forest.get(row).get(col) == 0) continue;

                    visited[row][col] = true;
                    q.add(new int[] {row, col});
                }
            }
            steps++;
        }
        return -1;
    }
}
