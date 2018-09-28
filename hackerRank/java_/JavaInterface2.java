package java_;

// https://www.hackerrank.com/challenges/java-inheritance-2/problem
public class JavaInterface2 {
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // My superclass is: Arithmetic
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // 42 13 20
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {}
