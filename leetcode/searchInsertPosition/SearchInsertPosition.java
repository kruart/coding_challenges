package searchInsertPosition;

// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) break;
            idx = i+1;
        }
        return idx;
    }
}
