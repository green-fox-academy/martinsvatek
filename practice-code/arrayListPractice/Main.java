package arrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> namesOfStudents = new ArrayList<>(); // syntax of list, names = string
        List<Student> students = new ArrayList<>(); // list for class student

        students.add(new Student(26, "Peter", true));
        students.add(new Student(27, "Naty", true));
        students.add(new Student(23, "SkyWalker", false));

        boolean natyIsHappy = students.get(1).getIsHappy(); // we want to know if naty is happy

        for (Student student : students) { // we want to print all ages, for each student from students
            int age = student.getAge(); // student class calling
            System.out.println(age);
        }

        int sum = 0; // sum of ages and average
        for (Student student : students) {
            int age = student.getAge();
            sum += age; // sum
        }
        double average = (double) sum / students.size(); // average
    }
}