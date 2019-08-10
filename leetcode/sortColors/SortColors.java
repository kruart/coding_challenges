package sortColors;

// https://leetcode.com/problems/sort-colors/submissions/
public class SortColors {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];  // red, white, blue

        for (int num : nums) {
            colors[num]++;
        }

        int idx = 0;
        int c = 0;  // color
        while (c <= 2) {
            if (colors[c] > 0) {
                nums[idx++] = c;
                colors[c]--;
            } else {
                c++;    // next color
            }
        }
    }
}
