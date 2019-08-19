package removeElement;

import java.util.Arrays;

// https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[idx++] = nums[i];
        }
        return idx;
    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        System.out.println(r.removeElement(new int[] {3,2,2,3},3));
    }
}
