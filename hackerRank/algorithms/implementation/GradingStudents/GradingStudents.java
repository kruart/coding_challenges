package algorithms.implementation.GradingStudents;

import java.util.Arrays;

// https://www.hackerrank.com/challenges/grading/problem
public class GradingStudents {
    static int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int diff = grades[i] % 5;
            if (grades[i] >= 38 && diff > 2)
                grades[i] = grades[i] - diff + 5;
        }
        return grades;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gradingStudents(new int[]{73, 67, 38, 33})));
    }
}
