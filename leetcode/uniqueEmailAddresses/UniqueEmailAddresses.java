package uniqueEmailAddresses;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String temp = parts[0].replace(".", "");
            int idx = temp.indexOf("+");
            parts[0] = idx == -1 ? temp : temp.substring(0, idx);
            s.add(String.join("@", parts));
        }
        return s.size();
    }
}
