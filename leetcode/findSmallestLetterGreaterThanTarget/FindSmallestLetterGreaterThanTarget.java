package findSmallestLetterGreaterThanTarget;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        char minAfterTarget = letters[letters.length-1];
        for (char letter : letters) {
            if (letter > target && letter < minAfterTarget) {
                minAfterTarget = letter;
            }
        }
        return minAfterTarget > target ? minAfterTarget : letters[0];
    }
}
