import java.util.Scanner;

public class OddEven {

    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = myObj.nextInt();

        if (number % 2 == 0) {
            System.out.println("Wow, you are Even!");
        } else {
            System.out.println("Wow, you are Odd!");
        }
    }
}
