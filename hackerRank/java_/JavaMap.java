package java_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/phone-book/problem
public class JavaMap {
    public static void main(String[] arg) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            System.out.println(phoneBook.containsKey(s) ? s + "=" + phoneBook.get(s) : "Not found");
        }
    }
}
