package algorithms.SaveThePrisoner;

// https://www.hackerrank.com/challenges/save-the-prisoner/problem
public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int k = (m - 1 + s) % n;
        return k == 0 ? n : k;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4, 6, 2));  // 3
        System.out.println(saveThePrisoner(5, 2, 1));  // 2
        System.out.println(saveThePrisoner(5, 2, 2));  // 3
        System.out.println(saveThePrisoner(7, 19, 2)); // 6
        System.out.println(saveThePrisoner(3, 7, 3));  // 3
        System.out.println(saveThePrisoner(5, 5, 1));  // 5
        System.out.println(saveThePrisoner(352926151, 380324688, 94730870));    // 122129406
        System.out.println(saveThePrisoner(94431605, 679262176, 5284458));      // 23525398
        System.out.println(saveThePrisoner(785405778, 835771758, 689182705));   // 739548684
        System.out.println(saveThePrisoner(999999999, 999999999, 1));           // 999999999
        System.out.println(saveThePrisoner(877625009, 999275937, 874127074));   // 118152992
    }
}
