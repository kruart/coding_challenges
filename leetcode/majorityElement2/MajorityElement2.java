package majorityElement2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://leetcode.com/problems/majority-element-ii/
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int num : nums) {
            m.merge(num, 1, Integer::sum);
        }

        return m.keySet().stream()
                .filter(k -> m.get(k) > nums.length / 3)
                .collect(Collectors.toList());
    }
}
