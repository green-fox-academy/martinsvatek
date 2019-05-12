public class SumDigit {
    public static void main (String[] args) {

        int x = 1234;
        System.out.println(sumDigit (x));
    }

    private static int sumDigit (int x) {

        if (x == 0) {
            return 0;
        } else {
            return sumDigit(x / 10) + x % 10;
        }
    }
}


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
// by 10 removes the rightmost digit (126 / 10 is 12).