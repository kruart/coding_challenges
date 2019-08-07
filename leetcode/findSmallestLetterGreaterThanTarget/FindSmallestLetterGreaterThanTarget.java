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

    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget f = new FindSmallestLetterGreaterThanTarget();
        System.out.println(f.nextGreatestLetter(new char[]{'a', 'b'}, 'z'));      // a
        System.out.println(f.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a')); // c
        System.out.println(f.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c')); // f
        System.out.println(f.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd')); // f
        System.out.println(f.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g')); // j
        System.out.println(f.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j')); // c
        System.out.println(f.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k')); // c
    }
}
