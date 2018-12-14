package algorithms.OrganizingContainersOfBalls;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
    static String organizingContainers(int[][] container) {
        int[] rowsSum = new int[container[0].length];
        int[] colsSum = new int[container[0].length];

        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container[i].length; j++) {
                rowsSum[i] += container[i][j];
                colsSum[j] += container[i][j];
            }
        }
        Arrays.sort(rowsSum);
        Arrays.sort(colsSum);
        return Arrays.equals(rowsSum, colsSum) ? "Possible" : "Impossible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int queries = scanner.nextInt();

        for (int q = 0; q < queries; q++) {
            int n = scanner.nextInt();
            scanner.nextLine();

            int[][] container = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }
            System.out.println(organizingContainers(container));
        }
    }
}