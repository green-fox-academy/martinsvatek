public class MatrixRotate {
    public static void main(String[] args) {

        int[][] matrix =  {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        int[][] rotatedMatrix = rotateMatrixClockwise(matrix);
        printMatrix(rotatedMatrix);
    }

    public static int[][] rotateMatrixClockwise(int[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
        int totalColsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[j][(totalColsOfRotatedMatrix - 1) - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}