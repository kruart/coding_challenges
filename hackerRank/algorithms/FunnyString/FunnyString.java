package algorithms.FunnyString;

// https://www.hackerrank.com/challenges/funny-string/problem
public class FunnyString {
//    way 1
    static String funnyString(String s) {
        return isFunny(s) ? "Funny" : "Not Funny";
    }

    private static boolean isFunny(String str) {
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            int diff1 = Math.abs(arr[i - 1] - arr[i]);    //from the start
            int diff2 = Math.abs(arr[arr.length - i] - arr[arr.length - i - 1]);  //from the end
           if (diff1 != diff2) {
               return false;
           }
        }
        return true;
    }

//    way 2
    static String funnyStringSecondWay(String s) {
        String s1 = getDiffAsString(s);
        String s2 = getDiffAsString(new StringBuilder(s).reverse().toString());
        return s1.equals(s2) ? "Funny" : "Not Funny";
    }

    private static String getDiffAsString(String str) {
        String newStr = "";
        for (int i = 1; i < str.toCharArray().length; i++) {
            int diff = Math.abs(str.charAt(i - 1) - str.charAt(i));
            newStr += String.valueOf(diff);
        }
        return newStr;
    }

    public static void main(String[] args) {
//        way 1
        System.out.println(funnyString("acxz"));    //Funny
        System.out.println(funnyString("bcxz"));    //Not Funny
        System.out.println(funnyString("ivvkxq"));    //Not Funny
        System.out.println(funnyString("ivvkx"));    //Not Funny

//        way 2
        System.out.println(funnyStringSecondWay("acxz"));    //Funny
        System.out.println(funnyStringSecondWay("bcxz"));    //Not Funny
        System.out.println(funnyStringSecondWay("ivvkxq"));    //Not Funny
        System.out.println(funnyStringSecondWay("ivvkx"));    //Not Funny
    }
}
