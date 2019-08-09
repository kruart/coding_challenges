package reorderLogFiles;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reorder-log-files/
public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.charAt(log.length()-1))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        letterLogs.sort((a, b) -> {
            int i1 = a.indexOf(" "), i2 = b.indexOf(" ");
            int compare = a.substring(i1+1).compareTo(b.substring(i2+1));
            return compare != 0 ? compare : a.substring(0, i1).compareTo(b.substring(0, i2));
        });

        int i = 0;
        for (String log : letterLogs) {
            result[i++] = log;
        }

        for (String log : digitLogs) {
            result[i++] = log;
        }
        return result;
    }
}
