# https://leetcode.com/problems/longest-well-performing-interval/
class Solution:
    def longestWPI(self, hours) -> int:
        m = {}
        max_intr = 0
        sum = 0

        for i in range(len(hours)):
            sum += 1 if hours[i] > 8 else -1

            if sum > 0:
                max_intr = i+1
            else:
                if sum not in m:
                    m[sum] = i
                if sum-1 in m:
                    max_intr = max(max_intr, i - m[sum-1])
        return max_intr

