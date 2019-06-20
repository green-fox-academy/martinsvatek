import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell 1. integer:");
        int int1 = scanner.nextInt();

        System.out.println("Tell 2. integer:");
        int int2 = scanner.nextInt();

        System.out.println("Tell 3. integer:");
        int int3 = scanner.nextInt();

        System.out.println("Tell 4. integer:");
        int int4 = scanner.nextInt();

        System.out.println("Tell 5. integer:");
        int int5 = scanner.nextInt();

        int sum = (int1 + int2 + int3 + int4 + int5);
        int avg = (int1 + int2 + int3 + int4 + int5)/5;

        System.out.println("Sum: " + sum + ", Average:" + avg);
    }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4