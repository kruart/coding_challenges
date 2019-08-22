package boatsToSavePeople;

// https://leetcode.com/problems/boats-to-save-people/
public class BoatsToSavePeople {
    // solution without sort (time 96%, memory 100%)
    public int numRescueBoats(int[] people, int limit) {
        int[] weights = new int[limit+1];

        for (int person : people) {
            weights[person]++;
        }

        int countBoats = 0;
        int right = limit;  // cursor starts from the end

        while (right > 0) {
            if (weights[right] == 0) right--;
            else {
                weights[right]--;
                int rem = limit - right;

                while (rem > 0) {
                    if (weights[rem] > 0 && right + rem <= limit) {
                        weights[rem]--;
                        break;
                    }
                    rem--;
                }
                countBoats++;
            }
        }
        return countBoats;
    }
}
