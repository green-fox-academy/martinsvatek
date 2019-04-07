import java.util.Scanner;

public class ParametricAverage {

    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int b;
        int sum = 0;
        float average = 0;
        int askedNumbers = 4;

        for (int i = 0; i < askedNumbers; i++) {

            System.out.println("Enter "+ (i+1) +". Number: ");
            b = myObj.nextInt();
            sum += b;
        }

        average= (float)sum/askedNumbers;
        System.out.println("Sum: "+ sum + " / Average:"+ average);
    }
}