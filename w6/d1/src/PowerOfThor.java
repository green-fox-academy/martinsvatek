import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

class PowerOfThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop

        while (true) {
            int remainingTurns = in.nextInt();// The remaining amount of turns Thor can move. Do not remove this line.
            if ((lightY - initialTY) == 0){
                System.out.print("");
            } else if (lightY < initialTY){
                System.out.print("N");
                initialTY--;
            } else {
                System.out.print("S");
                initialTY++;
            }
            if ((lightX - initialTX) ==0){
                System.out.print("");
            } else if (lightX < initialTX){
                System.out.print("W");
                initialTX--;
            } else {
                System.out.print("E");
                initialTX++;
            }

            // Write an action using System.out.println()

            System.err.println("Thor: " + initialTX + ", " + initialTY);
            System.err.println("Light: " + lightX + ", " + lightY);


            // A single line providing the move to be made: N NE E SE S SW W or NW

            System.out.print("\n");
        }
    }
}