public class TwoNumbers {
    public static void main(String[] args) {

        int numberOne = 22;
        int numberTwo = 13;

        int addition = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiplication = numberOne * numberTwo;
        double division = (double)numberOne / (double)numberTwo;
        int reminder = numberOne % numberTwo;

        System.out.println("addition is " + addition);
        System.out.println("subtraction is " + subtraction);
        System.out.println("multiplication is " + multiplication);
        System.out.println("division is " + division);
        System.out.println("reminder is " + reminder);
    }
}