package java_;

// https://www.hackerrank.com/challenges/java-generics/problem
public class JavaGenerics {

    static <T> void printArray(T[] arr) {
//        Arrays.stream(arr).forEach(System.out::println);      //java 8
        for (T elem : arr) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"Hello", "World"});
    }
}
