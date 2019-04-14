import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines of diamond do you want?");
        int lines = scanner.nextInt();

        int increment = 0;

        for (int a = 0; a < lines / 2 + 1; a++) {

            for (int b = lines / 2; b > a; b--) {
                System.out.print(" ");
            }

            for (int b = 0; b < a + increment + 1; b++) {
                System.out.print("*");
            }

            increment++;
            System.out.println();
        }

        int decrement = lines / 2;

        for (int a = 0; a < lines / 2; a++) {

            for (int b = 0; b < a + 1; b++) {
                System.out.print(" ");
            }

            for (int b = lines / 2; b > a - decrement + 1; b--) {
                System.out.print("*");
            }

            decrement--;
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was