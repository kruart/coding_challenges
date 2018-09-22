package java_;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-date-and-time/problem
class JavaDateAndTime {
    static String getDay(String day, String month, String year) {
        String date = month + " " + day + " " + year;
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("MM dd yyyy")).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}