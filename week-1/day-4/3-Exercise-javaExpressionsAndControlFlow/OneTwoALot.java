import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your number");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Not enough");
        } else if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else {
            System.out.println("a lot");
        }
    }
}

// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot