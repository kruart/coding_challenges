package java_;

// https://www.hackerrank.com/challenges/java-singleton/problem
public class JavaSingleton {
    public static void main(String[] args) {
        System.out.println(Singleton.getSingleInstance());
        System.out.println(Singleton.getSingleInstance());
    }
}

class Singleton{
    public String str;
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
