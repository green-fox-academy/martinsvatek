import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines of pyramid do you want?");
        int lines = scanner.nextInt();

        int increment = 1;

        //PYRAMID

        for (int a = 0; a < lines; a++) {

            //NO SYMBOLS

            for (int b = lines; b > a; b--) {
                System.out.print(" ");
            }

            //SYMBOLS

            for (int b = 0; b < a + increment; b++) {
                System.out.print("*");
            }

            //LINES

            increment++;
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was