package eNumExercise;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        for (Names people : Names.values()) {
            System.out.printf("%s: %s, %s\n", people, people.getDescription(), people.getAge());
        }

        System.out.println("-----");

        for (Names people : EnumSet.range(Names.kelsey, Names.candy)) { // define a range
            System.out.printf("%s: %s, %s\n", people, people.getDescription(), people.getAge());
        }
    }
}