import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lenght");
        double length = scanner.nextDouble();

        System.out.println("Enter width");
        double width = scanner.nextDouble();

        System.out.println("Enter height");
        double height = scanner.nextDouble();

        double volume = length * width * height;
        double surface = 2 * ((length * width) + (width * height) + (height * length));

        System.out.println("Volume: " + volume + " and Surface area: " + surface);
    }
}