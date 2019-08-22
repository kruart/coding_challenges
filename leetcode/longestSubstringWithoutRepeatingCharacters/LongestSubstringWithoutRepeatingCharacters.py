# https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        m = {}
        max_len = 0
        last_idx = 0

        for i in range(len(s)):
            letter = s[i]

            if letter in m and m[letter] >= last_idx:
                last_idx = m[letter] + 1

            m[letter] = i
            max_len = max(max_len, i - last_idx + 1)
        return max_len
