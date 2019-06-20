package hospitalInherintance;

public class Main {
    public static void main(String[] args) {

        // Code for manual testing:
        Queue queue = new ClassicQueue();
        Hospital hospital = new Hospital(queue);

        Patient firstPatient = new Patient();
        Patient secondPatient = new Patient();
        Patient thirdPatient = new Patient();

        hospital.addPatient(firstPatient);
        hospital.addPatient(secondPatient);
        hospital.addPatient(thirdPatient);

        hospital.treatNextPatient();
        hospital.treatNextPatient();
        hospital.treatNextPatient();
        hospital.treatNextPatient();
        hospital.treatNextPatient();
        hospital.treatNextPatient();
    }
}