package findWordsThatCanBeFormedByCharacters;

// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] letters = new int[26];
        int totalLen = 0;

        for (char ch : chars.toCharArray()) {
            letters[ch - 'a']++;
        }

        for (String word : words) {
            if (isForm(word, letters)) totalLen += word.length();
        }
        return totalLen;
    }

    private boolean isForm(String word, int[] letters) {
        int[] localLetters = new int[26];

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            localLetters[idx]++;
            if (localLetters[idx] > letters[idx]) {
                return false;
            }
        }
        return true;
    }
}
