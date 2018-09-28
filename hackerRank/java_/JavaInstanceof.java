package java_;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
public class JavaInstanceof {
    static String count(ArrayList mylist){
        int a = 0,b = 0,c = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof StudentClass)
                a++;
            if(element instanceof RockstarClass)
                b++;
            if(element instanceof HackerClass)
                c++;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }

    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String s=sc.next();
            if(s.equals("Student")) mylist.add(new StudentClass());
            if(s.equals("Rockstar")) mylist.add(new RockstarClass());
            if(s.equals("Hacker")) mylist.add(new HackerClass());
        }
        System.out.println(count(mylist));
    }
}

class StudentClass{}
class RockstarClass{}
class HackerClass{}
