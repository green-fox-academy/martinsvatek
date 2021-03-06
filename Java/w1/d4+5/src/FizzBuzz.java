public class FizzBuzz {
    public static void main(String[] args) {

        for (int a = 0; a < 100; a++) {
            int b = a + 1;

            if ((b % 3 == 0) && (b % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (b % 3 == 0) {
                System.out.println("Fizz");
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b);
            }
        }
    }
}

// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.