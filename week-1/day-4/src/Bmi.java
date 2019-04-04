public class Bmi {
    public static void main(String[] args) {

        double massInKg = 93, heightInM = 1.93, bmi;

        bmi = massInKg / Math.pow (heightInM, 2);

        System.out.println(bmi);

        // Print the Body mass index (BMI) based on these values
    }
}
