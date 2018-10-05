package algorithms.implementation.CountingValleys;

// https://www.hackerrank.com/challenges/counting-valleys/problem
public class CountingValleys {
    static int countingValleys(int n, String s) {
        int valleyCounts = 0;
        int seaLevel = 0;

        for (char c : s.toCharArray()) {
            if (c == 'U') {
                seaLevel++;
                //if we traversed a valley and step up to sea level
                if (seaLevel == 0) valleyCounts++;
            }
            else if (c == 'D') seaLevel--;
        }
        return valleyCounts;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU")); //1
        System.out.println(countingValleys(12, "DDUUDDUDUUUD")); //2
        System.out.println(countingValleys(2, "DDUD")); //0
    }
}

//DD UU DD U D UUU D

//_            /\_
// \  /\     /
//  \/  \/\/