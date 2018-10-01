package java_;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-regex/problem
public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String pattern = "^(([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d{1,2}?|2[0-4]\\d|25[0-5])$";
}
