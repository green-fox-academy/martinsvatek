//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorio {
    public static void main(String[] args) {

        int number = 4;
        factorio(number);

        System.out.println(factorio(number));
    }

    public static int factorio(int number) {

        int factorio = 1;
        for (int i = 0; i < number; i++) {
            factorio *= i + 1;
        }

        return (factorio);
    }
}