public class Bmi {
    public static void main(String[] args) {

        double massInKg = 93;
        double heightInM = 1.93;
        double bmi = massInKg / Math.pow(heightInM, 2);

        System.out.println(bmi);
    }
}

// Print the Body mass index (BMI) based on these values