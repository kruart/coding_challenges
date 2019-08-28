package letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationsOfAPhoneNumber {
    private String[] letterArr = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> combs = new ArrayList<>();

        if (!digits.isEmpty()) getCombs(digits, 0, "", combs);
        return combs;
    }

    void getCombs(String digits, int level, String comb, List<String> combs) {
        if (level == digits.length()) {
            combs.add(comb);
            return;
        }

        String letters = letterArr[(digits.charAt(level)) - '0' - 2]; // convert char to int and subtract 2
        for (char ch : letters.toCharArray()) {
            getCombs(digits, level+1, comb + ch, combs);
        }
    }
}
