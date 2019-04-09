import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter lenght");
        double length = myObj.nextDouble();

        System.out.println("Enter width");
        double width = myObj.nextDouble();

        System.out.println("Enter height");
        double height = myObj.nextDouble();

        System.out.println("Volume: " + length * width * height + " and Surface area: " + 2 * ((length * width) + (width * height) + (height * length)));
    }
}