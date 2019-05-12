public class Sum {
    public static void main(String[] args) {

        int number = 5;
        int result = sum(number);

        System.out.println(result);
    }

    private static int sum(int number) {

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return (sum);
    }
}

// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
// void - just print sth
// int