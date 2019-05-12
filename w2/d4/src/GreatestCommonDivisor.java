public class GreatestCommonDivisor {
    public static void main (String[] args) {

        int x = 110;
        int y = 20;
        int divisor;

        if (x < y) {
            divisor = x;
        } else {
            divisor = y;
        }
        System.out.println(divisorOfTwoNumbers(x, y, divisor));
    }

    private static int divisorOfTwoNumbers (int x, int y, int divisor) {

        if (x % divisor == 0 && y % divisor == 0) {
            return divisor;
        } else {
            return divisorOfTwoNumbers(x, y, divisor - 1);
        }
    }
}

// Find the greatest common divisor of two numbers using recursion.
