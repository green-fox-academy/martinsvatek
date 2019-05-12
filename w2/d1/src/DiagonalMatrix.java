import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rows: ");
        int Rows = scanner.nextInt();
        System.out.println("Columns: ");
        int Columns = scanner.nextInt();

        int[][] matrix = new int[Rows][Columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output