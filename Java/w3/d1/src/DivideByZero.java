import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("By which number do you want to divide number 10?");
        int number = scanner.nextInt();

        tenDividedBy(number);
    }

    private static void tenDividedBy(int number) {

        try {
            double result = 10 / number;
            System.out.println(result);
        } catch (ArithmeticException e) {   //will catch errors
            System.out.println("Fail! Dont be stupid and use different number!");
        }
    }
}

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0