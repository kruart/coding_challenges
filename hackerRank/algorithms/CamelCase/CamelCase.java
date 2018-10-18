package algorithms.CamelCase;

// https://www.hackerrank.com/challenges/camelcase/problem
public class CamelCase {
    static int camelcase(String s) {
//        int count = 1;  //first word in lowercase, so +1
//        for (char c : s.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                count++;
//            }
//        }
//        return count;
        return (int) (s.chars().filter(Character::isUpperCase).count() + 1);    //first word in lowercase, so +1
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));    //5
    }
}
