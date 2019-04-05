public class TwoNumbers {
    public static void main(String[] args) {

        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22

        int num1 = 22, num2 = 13, sum, sub, mul, integ, remin;
        sum = num1 + num2;

        System.out.println(sum);

        // Print the result of 13 substracted from 22

        sub = num1 - num2;

        System.out.println(sub);

        // Print the result of 22 multiplied by 13

        mul = num1 * num2;

        System.out.println(mul);

        // Print the result of 22 divided by 13 (as a decimal fraction)

        double num3 = 22, num4 = 13, div;
        div = num3 / num4;

        System.out.println(div);

        // Print the integer part of 22 divided by 13

        integ = num1 / num2;

        System.out.println(integ);

        // Print the remainder of 22 divided by 13

        remin = num1 % num2;

        System.out.println(remin);

    }
}
