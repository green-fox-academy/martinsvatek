public class Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    public class UserInput {
        public static void main(String[] args) {
            // Creates a scanner
            Scanner scanner = new Scanner(System.in);

            // The program stops and waits for user input and to press enter
            String userInput1 = scanner.nextLine();

            // It prints the whole line that was given by the user
            System.out.println(userInput1);

            // The program stops and waits for user input that is an integer and to press enter
            int userInput2 = scanner.nextInt();

            // It prints the integer
            System.out.println(userInput2);
        }
    }
}
