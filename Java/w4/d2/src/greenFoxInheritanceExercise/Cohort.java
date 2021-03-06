package greenFoxInheritanceExercise;

import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student givenStudent) {
        students.add(givenStudent);
    }

    public void addMentor(Mentor givenMentor) {
        mentors.add(givenMentor);
    }

    public void info() {
        System.out.println("The " + name + " has "
                + students.size() + " students and " + mentors.size() + " mentors.");
    }
}