public class NumberAdder {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(factorialWithRecursion (x));
    }

    private static int factorialWithRecursion(int x) {

        if (x == 1) {
            return 1;
        } else {
            return x + factorialWithRecursion(x - 1);
        }
    }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.