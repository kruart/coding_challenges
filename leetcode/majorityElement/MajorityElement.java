package majorityElement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int k : nums) {
            m.merge(k, 1, Integer::sum);
            if (m.get(k) > nums.length / 2) return k;
        }
        return -1;
    }
}
