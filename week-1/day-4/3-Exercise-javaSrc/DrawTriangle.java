import java.util.Scanner;

public class DrawTriangle {

    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = myObj.nextInt();

        for (int a = 0; a < number; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}