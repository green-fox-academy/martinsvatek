import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length");
        double length = scanner.nextDouble();

        System.out.println("Enter width");
        double width = scanner.nextDouble();

        System.out.println("Enter height");
        double height = scanner.nextDouble();

        double volume = length * width * height;
        double surface = 2 * ((length * width) + (width * height) + (height * length));

        System.out.println("Volume: " + volume + "\nSurface area: " + surface);
    }
}

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000