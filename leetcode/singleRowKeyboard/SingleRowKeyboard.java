package singleRowKeyboard;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/contest/biweekly-contest-7/problems/single-row-keyboard/
public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> keys = new HashMap<>();

        char[] arr = keyboard.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            keys.put(arr[i], i);
        }

        int sum = 0;
        int curr = 0;
        for (char c : word.toCharArray()) {
            sum += (Math.abs(curr - keys.get(c)));
            curr = keys.get(c);
        }
        return sum;
    }
}
