package java_.priorityQueue;

import java.util.*;

// https://www.hackerrank.com/challenges/java-priority-queue/problem
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student {
    private int id;
    private String name;
    private double CGPA;

    Student(int id, String name, double CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCGPA() {
        return CGPA;
    }
}

class Priorities {
    private Comparator<Student> comp = Comparator
            .comparing(Student::getCGPA, Comparator.reverseOrder())
            .thenComparing(Student::getName)
            .thenComparing(Student::getId);

    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> students = new PriorityQueue<>(comp);

        for (String event : events) {
            String[] arr = event.split(" ");

            if (arr[0].equals("ENTER")) {
                int id = Integer.parseInt(arr[3]);
                String name = arr[1];
                double CGPA = Double.parseDouble(arr[2]);
                students.add(new Student(id, name, CGPA));
            } else if (arr[0].equals("SERVED")) {
                students.poll();
            }
        }

        List<Student> l = new ArrayList<>();
        while (!students.isEmpty()) {
            l.add(students.poll());
        }

        return l;
    }
}

