import java.util.Scanner;

public class DrawChessTable {

    public static void main(String[] args) {

        System.out.println("How many fields in row do you want?");
        Scanner myObj = new Scanner(System.in);

        int fieldsInRow = myObj.nextInt();

        for (int i = 0; i < fieldsInRow; i++) {
            for (int j = 0; j < fieldsInRow; j++) {
                if (j % 2 == 0 && i % 2 == 0) {
                    System.out.print("%");
                } else if (j % 2 != 0 && i % 2 != 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %