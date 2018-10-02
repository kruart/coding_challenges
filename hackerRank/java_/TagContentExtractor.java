package java_;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.hackerrank.com/challenges/tag-content-extractor/problem
public class TagContentExtractor {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String line = in.nextLine();
            printContentFromTag(line);
            testCases--;
        }
    }

    private static void printContentFromTag(String line) {
        boolean isMatches = false;
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            isMatches = true;
            System.out.println(matcher.group(2));
        }
        if (!isMatches) System.out.println("None");
    }
}
