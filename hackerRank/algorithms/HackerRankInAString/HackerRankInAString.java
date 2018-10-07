package algorithms.HackerRankInAString;

// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
public class HackerRankInAString {

    static String hackerrankInString(String s) {
        String pattern = "hackerrank";
        int lastIndex = -1;
        for (String ch : pattern.split("")) {
            int indexOfChar = s.indexOf(ch, lastIndex + 1);
            if (indexOfChar == -1) {
                return "NO";
            }
            lastIndex = indexOfChar;
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));   //YES
        System.out.println(hackerrankInString("hackerworld"));          //NO
        System.out.println(hackerrankInString("hhaacckkekraraannk"));   //YES
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));   //NO

        System.out.println(hackerrankInString("knarrekcah"));                   //NO
        System.out.println(hackerrankInString("hackerrank"));                   //YES
        System.out.println(hackerrankInString("hackeronek"));                   //NO
        System.out.println(hackerrankInString("abcdefghijklmnopqrstuvwxyz"));   //NO
        System.out.println(hackerrankInString("rhackerank"));                   //NO
        System.out.println(hackerrankInString("ahankercka"));                   //NO
        System.out.println(hackerrankInString("hacakaeararanaka"));             //YES
        System.out.println(hackerrankInString("hhhhaaaaackkkkerrrrrrrrank"));   //YES
        System.out.println(hackerrankInString("crackerhackerknar"));            //NO
        System.out.println(hackerrankInString("hhhackkerbanker"));              //NO
    }
}
