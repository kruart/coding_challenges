package dailyTemperatures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < T.length; i++) {
            while (!s.isEmpty() && T[i] > T[s.peek()]) {
                int tempIdx = s.pop();
                days[tempIdx] = i - tempIdx;
            }
            s.push(i);
        }
        return days;
    }
}
