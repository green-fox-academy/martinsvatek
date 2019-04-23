package GreenFoxInheritanceExercise;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public int skipDays(int numberOfDays) {
        return skippedDays += numberOfDays;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender
                + " from " + previousOrganization
                + " who skipped " + skippedDays + " days from the course already.");
    }
}