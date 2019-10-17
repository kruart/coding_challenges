package jumpGame;

// https://leetcode.com/problems/jump-game/
public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        int idx = 0;

        while (idx < nums.length) {
            if (idx > maxJump) return false;
            maxJump = Math.max(maxJump, nums[idx] + idx++);
        }
        return true;
    }
}
