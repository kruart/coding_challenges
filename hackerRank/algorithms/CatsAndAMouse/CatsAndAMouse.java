package algorithms.CatsAndAMouse;

// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int catAToMouse = Math.abs(x - z);
        int catBToMouse = Math.abs(y - z);

        if (catAToMouse < catBToMouse) return "Cat A";
        else if (catBToMouse < catAToMouse) return "Cat B";
        else return "Mouse C";
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(2, 5, 4));       //Cat B
        System.out.println(catAndMouse(1, 2, 3));       //Cat И
        System.out.println(catAndMouse(1, 3, 2));       //Mouse C
    }
}
