package algorithms.TwoCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/two-characters/problem
public class TwoCharacters {
    static int alternate(String s) {
        String uniqueChars = Arrays.stream(s.split(""))
                .distinct()
                .collect(Collectors.joining());

        List<String> pairs = new ArrayList<>(); //create unique pairs
        for (int i = 0; i < uniqueChars.length(); i++) {
            for (int j = i + 1; j < uniqueChars.length(); j++) {
                pairs.add(uniqueChars.charAt(i) + "" + uniqueChars.charAt(j));
            }
        }

        int maxLength = 0;
        for (String pair: pairs) {
            String pattern = String.format("[^%s]", pair);
            String newStr = s.replaceAll(pattern, "");
            boolean isAlternating  = true;
            for (int j = 2; j < newStr.length(); j++) {
                if (newStr.charAt(j - 2) != newStr.charAt(j)) {
                    isAlternating  = false;
                    break;
                }
            }
            if (isAlternating  && maxLength < newStr.length()) {
                maxLength = newStr.length();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(alternate("beabeefeab"));                     //babab == 5
        System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));   //abababab == 8
        System.out.println(alternate("asvkugfiugsalddlasguifgukvsa"));   //0
    }
}
