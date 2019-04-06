import java.util.Scanner;

public class MultiplicationTable {

    // Create a program that asks for a number and prints the multiplication table with that number
    //
    // Example:
    // The number 15 should print:
    //
    // 1 * 15 = 15
    // 2 * 15 = 30
    // 3 * 15 = 45
    // 4 * 15 = 60
    // 5 * 15 = 75
    // 6 * 15 = 90
    // 7 * 15 = 105
    // 8 * 15 = 120
    // 9 * 15 = 135
    // 10 * 15 = 150

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number which do you want to multiply");
        int input = myObj.nextInt();

        for (int a = 1; a < 11; a++) {
            int result = a * input;
            System.out.println(a + " * " + input + " = " + result);
        }
    }
}
