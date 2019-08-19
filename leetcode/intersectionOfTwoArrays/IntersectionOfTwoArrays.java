package intersectionOfTwoArrays;

import java.util.*;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i : nums1) s1.add(i);

        for (int i : nums2) {
            if (s1.contains(i)) s2.add(i);
        }
        int[] result = new int[s2.size()];
        int idx = 0;

        for (Integer i : s2) {
            result[idx++] = i;
        }
        return result;
    }
}
