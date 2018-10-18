package java_;

import jline.internal.InputStreamReader;
import java.io.BufferedReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

// https://www.hackerrank.com/challenges/prime-checker/problem
public class PrimeChecker {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

class Prime {
    void checkPrime(int... numbers) {
        StringBuilder str = new StringBuilder();
        for (int number : numbers) {
            boolean isPrime = number == 2 || number > 2;
            for (int i = 2; i*i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (str.length() != 0) str.append(" ");
                str.append(number);
            }
        }
            System.out.println(str);
    }
}
