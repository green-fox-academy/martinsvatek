
import java.util.Scanner;

    public class Cuboid {
        public static void main(double[] args) {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter lenght");
            double lenght = myObj.nextLine();

            System.out.println("Enter width");
            double width = myObj.nextLine();

            System.out.println("Enter height");
            double height = myObj.nextLine();

            System.out.println("Volume: " lenght * width * height);
        }
    }