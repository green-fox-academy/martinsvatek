public class TwoNumbers {

    public static void main(String[] args) {

        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22

        int num1 = 22;
        int num2 = 13;
        int sum = num1 + num2;

        System.out.println(sum);

        // Print the result of 13 substracted from 22

        int  sub = num1 - num2;

        System.out.println(sub);

        // Print the result of 22 multiplied by 13

        int mul = num1 * num2;

        System.out.println(mul);

        // Print the result of 22 divided by 13 (as a decimal fraction)

        double num3 = 22;
        double num4 = 13;
        double div = num3 / num4;

        System.out.println(div);

        // Print the integer part of 22 divided by 13

        int integer = num1 / num2;

        System.out.println(integer);

        // Print the remainder of 22 divided by 13

        int reminder = num1 % num2;

        System.out.println(reminder);
    }
}