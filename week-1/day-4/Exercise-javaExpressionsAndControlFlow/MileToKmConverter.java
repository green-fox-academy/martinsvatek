import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter km distance");
        double km = myObj.nextDouble();

        double kmToMileConvertor = 0.6213711922;

        System.out.println("Here you are your distance in miles: " + km * kmToMileConvertor);
    }
}

// Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it