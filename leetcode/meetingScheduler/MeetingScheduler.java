package meetingScheduler;

import java.util.*;

// https://leetcode.com/problems/meeting-scheduler/
public class MeetingScheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a, b) -> a[0] - b[0]);
        Arrays.sort(slots2, (a, b) -> a[0] - b[0]);
        List<Integer> l = new ArrayList<>();

        for (int[] s1 : slots1) {
            for (int[] s2 : slots2) {
                if (s2[0] < s1[1] && s2[1] > s1[0]) {
                    int low = Math.max(s1[0], s2[0]);
                    int high = Math.min(s1[1], s2[1]);
                    int diff =  high - low;
                    if (diff >= duration) {
                        l.add(low);
                        l.add(low + duration);
                        return l;
                    }
                }
            }
        }
        return l;
    }
}
