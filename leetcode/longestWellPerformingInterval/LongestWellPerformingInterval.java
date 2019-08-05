package longestWellPerformingInterval;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-well-performing-interval/
public class LongestWellPerformingInterval {
    // O(n)
    public int longestWPI(int[] hours) {
        Map<Integer, Integer> m = new HashMap<>();

        int res = 0;
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i] > 8 ? 1 : -1;

            if (sum > 0) res = i+1;
            else {
                m.putIfAbsent(sum, i);
                if (m.containsKey(sum-1)) {
                    res = Math.max(res, i - m.get(sum-1));
                }
            }
        }
        return res;
    }

    // O(n2)
    public int longestWPI2(int[] hours) {
        int[] days = new int[hours.length+1];
        days[0] = 0;

        int intrv = 0;
        for (int i = 1; i < days.length; i++) {
            intrv = hours[i-1] > 8 ? intrv + 1 : intrv - 1;
            days[i] = intrv;
        }

        int res = 0;
        for (int i = 0; i < days.length; i++) {
            for (int j = i+1; j < days.length; j++) {
                if (days[j] - days[i] > 0) res = Math.max(j-i, res);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        LongestWellPerformingInterval s = new LongestWellPerformingInterval();
        System.out.println(s.longestWPI(new int[]{6,6,9}));           //1
        System.out.println(s.longestWPI(new int[]{6,9,9}));           //3
        System.out.println(s.longestWPI(new int[]{6,9,6,9}));         //3
        System.out.println(s.longestWPI(new int[]{9,9,6,0,6,6,9}));   //3
        System.out.println(s.longestWPI(new int[]{6,9,9,6,9,6,6}));   //5
        System.out.println(s.longestWPI(new int[]{6,6,6,6,9,9,9,9})); //7
        System.out.println(s.longestWPI(new int[]{6,6,6,6,9,6,9,9})); //5

        System.out.println("===");

        System.out.println(s.longestWPI2(new int[]{6,6,9}));           //1
        System.out.println(s.longestWPI2(new int[]{6,9,9}));           //3
        System.out.println(s.longestWPI2(new int[]{6,9,6,9}));         //3
        System.out.println(s.longestWPI2(new int[]{9,9,6,0,6,6,9}));   //3
        System.out.println(s.longestWPI2(new int[]{6,9,9,6,9,6,6}));   //5
        System.out.println(s.longestWPI2(new int[]{6,6,6,6,9,9,9,9})); //7
        System.out.println(s.longestWPI2(new int[]{6,6,6,6,9,6,9,9})); //5
    }
}
