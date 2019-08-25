package minimumCostToConnectSticks;

import java.util.PriorityQueue;

// https://leetcode.com/contest/biweekly-contest-7/problems/minimum-cost-to-connect-sticks/
public class MinimumCostToConnectSticks {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int stick : sticks) {
            p.add(stick);
        }
        int sum = 0;

        while (p.size() > 1) {
            int connect = p.poll() + p.poll();
            sum += connect;
            p.add(connect);
        }
        return sum;
    }
}
