import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the number of chickens");
        int chickens = myObj.nextInt();

        System.out.println("Enter the number of pigs");
        int pigs = myObj.nextInt();

        int amountOfLegs = (chickens * 2) + (pigs * 4);

        System.out.println("All animals have " + amountOfLegs);
    }
}