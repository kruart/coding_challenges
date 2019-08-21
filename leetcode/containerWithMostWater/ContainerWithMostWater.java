package containerWithMostWater;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length-1;

        while (left < right) {
            int leftLevel = height[left], rightLevel = height[right];
            int currArea = (right-left) * Math.min(leftLevel, rightLevel);
            maxArea = Math.max(maxArea, currArea);
            if (leftLevel < rightLevel) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return maxArea;
    }
}
