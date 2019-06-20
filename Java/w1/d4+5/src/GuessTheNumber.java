import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secretNumber = 11;
        boolean repeatQuestion = true;

        while (repeatQuestion) {
            System.out.println("Try to guess the secret number");
            int guessNumber = scanner.nextInt();

            if (secretNumber > guessNumber) {
                System.out.println("The secret number is higher");
            } else if (secretNumber < guessNumber) {
                System.out.println("The secret number is lower");
            } else {
                System.out.println("You found the secret number: " + secretNumber);
                repeatQuestion = false;
            }
        }
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8