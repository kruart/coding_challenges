package java_;

import java.util.*;

// https://www.hackerrank.com/challenges/java-sort/problem
public class JavaSort {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahim", 3.76));

//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());

//        while(testCases > 0){
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }

        Collections.sort(studentList);
        for(Student st: studentList) {
            System.out.println(st.getFname());
        }
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int compare = Double.compare(o.cgpa, this.cgpa);
        if (compare == 0) {
            compare = this.fname.compareTo(o.fname);
        }
        if (compare == 0) {
            compare = Integer.compare(this.id, o.id);
        }
        return compare;
    }
}
