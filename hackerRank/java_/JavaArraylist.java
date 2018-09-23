package java_;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-arraylist/problem
public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String[]> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] d = sc.nextLine().split(" ");
            arr.add(d);
        }

        int q = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < q; i++) {
            try {
                String[] queries = sc.nextLine().split(" ");
                int arrIndex = Integer.parseInt(queries[0]) - 1;
                int elemIndex = Integer.parseInt(queries[1]);
                String str = arr.get(arrIndex)[elemIndex];
                System.out.println(Integer.parseInt(str));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
