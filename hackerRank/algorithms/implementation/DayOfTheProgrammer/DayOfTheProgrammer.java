package algorithms.implementation.DayOfTheProgrammer;

// https://www.hackerrank.com/challenges/day-of-the-programmer/problem
public class DayOfTheProgrammer {

    static String dayOfProgrammer(int year) {
        return year == 1918 ? "26.09.1918" :
                isLeapYear(year) ? String.format("12.09.%s", year): String.format("13.09.%s", year);
    }

    private static boolean isLeapYear(int year) {
        if (year > 1918) {
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        } else {
            return year % 4 == 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));  //26.09.2016
        System.out.println(dayOfProgrammer(1984));  //12.09.2016
        System.out.println(dayOfProgrammer(2016));  //12.09.2016
        System.out.println(dayOfProgrammer(2017));  //13.09.2016
    }
}
