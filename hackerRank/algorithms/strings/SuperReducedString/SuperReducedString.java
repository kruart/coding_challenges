package algorithms.strings.SuperReducedString;

public class SuperReducedString {

    static String superReducedString(String s) {
        int index = 1;
        while (index < s.length()) {
            if (s.charAt(index - 1) == s.charAt(index)) {
                s = s.substring(0, index - 1) + s.substring(index + 1);
                index = 0;
            }
            index++;
        }
        return !s.isEmpty() ? s : "Empty String";
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));    //abd
        System.out.println(superReducedString("aa"));           //EmptyString
        System.out.println(superReducedString("baab"));         //EmptyString
    }
}
