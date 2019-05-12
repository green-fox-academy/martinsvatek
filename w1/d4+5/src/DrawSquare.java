import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please give me a number");
        int number = myObj.nextInt();

        String line = "";
        String sign = "%";
        String empty = " ";

        for (int i = 0; i < number; i++) {
            line = "";
            if (i == 0 || i == number - 1) {
                for (int j = 0; j < number; j++) {
                    line += sign;
                }

                System.out.println(line);

            } else {
                line = "";
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == number - 1) {
                        line += sign;
                    } else {
                        line += empty;
                    }
                }

                System.out.println(line);
            }
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was