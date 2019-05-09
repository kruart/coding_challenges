package algorithms.HackerlandRadioTransmitters;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
public class HackerlandRadioTransmitters {
    static int hackerlandRadioTransmitters(int[] x, int k) {
        Arrays.sort(x);
        int count = 1;  // minimum one transmitter
        int leftCoverage = 0;
        int lastTransmitter = x[0];
        for (int house : x) {
            // if signal still covers, move transmitter to current house
            if (house - lastTransmitter + leftCoverage <= k) {
                leftCoverage += house - lastTransmitter;
                lastTransmitter = house;
            }
            // if signal already doesn't cover, add a new transmitter to current house
            else if (house - lastTransmitter > k) {
                count++;
                leftCoverage = 0;
                lastTransmitter = house;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] x = new int[n];

        String[] xItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(xItems[i]);
        }

        System.out.println(hackerlandRadioTransmitters(x, k));
        scanner.close();
    }
}

