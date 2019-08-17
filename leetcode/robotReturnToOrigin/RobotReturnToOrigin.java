package robotReturnToOrigin;

// https://leetcode.com/problems/robot-return-to-origin/
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L')      x--;
            else if (ch == 'R') x++;
            else if (ch == 'D') y--;
            else if (ch == 'U') y++;
        }
        return x == 0 && y == 0;
    }
}
