
import java.util.Scanner;

    public class Cuboid {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter lenght");
            double lenght = myObj.nextDouble();

            System.out.println("Enter width");
            double width = myObj.nextDouble();

            System.out.println("Enter height");
            double height = myObj.nextDouble();

            System.out.println("Volume: " + lenght * width * height);
            System.out.println("Volume: " + lenght * width * height);
        }
    }