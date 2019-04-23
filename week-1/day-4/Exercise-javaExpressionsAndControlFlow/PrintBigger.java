import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me first number");
        int a = scanner.nextInt();
        System.out.println("Give me second number");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " is bigger one");
        } else if (a < b) {
            System.out.println(b + " is bigger one");
        } else {
            System.out.println("Both numbers have the same value.");
        }
    }
}

// Write a program that asks for two numbers and prints the bigger one