package HanoiTower;

public class HanoiTower {
    public static void main(String[] args) {
        hanoi(4, "left", "right", "middle");
    }

    private static void hanoi(int height, String from, String to, String through) {
        if (height > 0) {
            hanoi(height - 1, from, through, to);
            System.out.println(from + " => " + to);
            hanoi(height - 1, through, to, from);
        }
    }
}