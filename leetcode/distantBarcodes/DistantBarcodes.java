package distantBarcodes;

import java.util.*;

// https://leetcode.com/problems/distant-barcodes/
public class DistantBarcodes {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int barcode : barcodes) {
            counter.put(barcode, counter.getOrDefault(barcode, 0) + 1);
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((c1, c2) -> c2[1] - c1[1]);
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            q.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int idx = 0;
        while (!q.isEmpty()) {
            List<int[]> local = new ArrayList<>();

            while(!q.isEmpty()) {
                int[] poll = q.poll();
                boolean isBreak = false;

                if (idx == 0 || poll[0] != barcodes[idx-1]) {
                    barcodes[idx++] = poll[0];
                    poll[1]--;
                    isBreak = true;
                }

                if (poll[1] > 0) {
                    local.add(poll);
                }
                if (isBreak) break;
            }
            q.addAll(local);
        }
        return barcodes;
    }
}
