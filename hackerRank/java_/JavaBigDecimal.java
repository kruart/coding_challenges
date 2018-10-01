package java_;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-bigdecimal/problem
public class JavaBigDecimal {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);  //Input
        int n = sc.nextInt();
        String []s=new String[n+2];

        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

//        int n = 9;
//        String [] s = new String[]{"-100","50","0","56.6","90","0.12",".12","02.34","000.000", null, null};

        sort(s);
//        sort2(s);

        //Output
        for(int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    private static void sort(String[] s) {
        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null || o2 == null) return 0;
            return new BigDecimal(o2).compareTo(new BigDecimal(o1));
        });
    }

    //bubble sort
    private static void sort2(String[] s) {
        int n = s.length - 2;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                BigDecimal b1 = new BigDecimal(s[j-1]);
                BigDecimal b2 = new BigDecimal(s[j]);
                int c = b1.compareTo(b2);
                if (c < 0) {
                    //swap elements
                    String temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }
            }
        }
    }
}
