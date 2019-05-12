import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of chickens");
        int chickens = scanner.nextInt();

        System.out.println("Enter the number of pigs");
        int pigs = scanner.nextInt();

        int chickensLegs = 2;
        int pigsLegs = 4;
        int amountOfLegs = (chickens * chickensLegs) + (pigs * pigsLegs);

        System.out.println("All animals have " + amountOfLegs);
    }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have