import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Wow, your number is Even!");
        } else {
            System.out.println("Wow, your number is Odd!");
        }
    }
}

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.