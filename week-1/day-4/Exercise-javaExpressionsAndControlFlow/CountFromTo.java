import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean whatever = true;

        while (whatever) {
            System.out.println("Enter your first number");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter your second number");
            int secondNumber = scanner.nextInt();

            if (firstNumber > secondNumber) {
                System.out.println("The second number should be bigger");
            } else {
                for (int a = firstNumber; a <= secondNumber; a++) {
                    System.out.println(a);
                    whatever = false;
                }
            }
        }
    }
}

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5