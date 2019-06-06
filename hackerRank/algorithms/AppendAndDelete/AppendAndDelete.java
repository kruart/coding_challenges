package algorithms.AppendAndDelete;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/append-and-delete/problem
public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        int totalLength = s.length() + t.length();
        if (k >= totalLength) return "Yes"; // if k-operations is bigger then total length

        int sameLength = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            sameLength++;
        }

        int diff = totalLength - 2 * sameLength;
        // if k >= diff and (k - diff) % 2 == even, because delete and append is 2(even) operations
        if (k >= diff && (k - diff) % 2 == 0) return "Yes";
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();

        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        scanner.close();
    }
}
