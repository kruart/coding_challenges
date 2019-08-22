package partitionLabels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/partition-labels/
public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] letters = new int[26];
        List<Integer> parts = new ArrayList<>();

        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            letters[arr[i] - 'a'] = i;
        }

        int i = 0;
        while (i < arr.length) {
            int end = letters[arr[i] - 'a'];
            int j = i;

            while (j < end) {
                end = Math.max(end, letters[arr[j] - 'a']);
                j++;
            }
            parts.add(j-i+1);
            i = j + 1;
        }
        return parts;
    }
}
