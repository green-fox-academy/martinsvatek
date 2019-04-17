package TeacherStudent;

public class Main {

    public static void main(String[] args) {

        Student Honza = new Student();
        Student Julie = new Student();

        Teacher teacherEnglish = new Teacher();
        Teacher teacherHistory = new Teacher();

        Honza.question(teacherEnglish);
        teacherEnglish.teach(Julie);
    }
}