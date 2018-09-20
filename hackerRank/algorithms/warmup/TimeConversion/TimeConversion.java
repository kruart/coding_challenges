package algorithms.warmup.TimeConversion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// https://www.hackerrank.com/challenges/time-conversion/problem
public class TimeConversion {

    static String timeConversion(String s) {
        DateTimeFormatter FMT_12 = DateTimeFormatter.ofPattern("h:mm:ssa");
        LocalTime time = LocalTime.parse(s, FMT_12);
        return time.getSecond() != 0 ? time.toString() : time.toString() + ":00";
    }

    static String timeConversion2(String s) {
        if (s.equals("12:00:00AM")) {
            return "00:00:00";
        }
        String[] timeArr = s.split(":");

        if (s.endsWith("PM")) {
            timeArr[0] = String.valueOf(Integer.parseInt(timeArr[0]) + 12);
        }
        String time = String.join(":", timeArr);
        return time.substring(0, time.length() - 2);
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("11:29:00PM"));

        System.out.println(timeConversion2("07:05:45PM"));
        System.out.println(timeConversion2("12:00:00AM"));
        System.out.println(timeConversion2("11:29:00PM"));
    }
}
