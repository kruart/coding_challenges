package findAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int i = Math.abs(num) - 1;
            if (nums[i] > 0) {
                nums[i] = -nums[i];
            }
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) l.add(i+1);
        }
        return l;
    }

}
