import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scanner.nextInt();

        for (int a = 0; a < number; a++) {
            for (int b = 0; b < a + 1; b++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was