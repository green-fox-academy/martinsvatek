public class MultiplyMatrix {
    public static void main(String[] args) {

        int[][] matrix =  {{1, 3, 6, 2},
                           {7, 5, 6, 1},
                           {3, 3, 1, 5},
                           {9, 0, 5, 3}};

        int[][] multipliedMatrix = multiplyMatrix(matrix);
        printMatrix(multipliedMatrix);
    }

    // multiply each even number by 2 in each even indexed row
    // multiply each odd number by 2 in each odd indexed row

    public static int[][] multiplyMatrix(int[][] matrix) { // for a static method you can't reach a nonstatic method (in this class has to be every method static)

        int[][] multipliedMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) { // number of sub-arrays
            if (matrix.length % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] % 2 == 0) {
                        matrix[i][j] *= 2;
                    }
                }
            } else {
                for (int k = 0; k < matrix[0].length; k++) {
                    if (matrix[i][k] % 2 != 0) {
                        matrix[i][k] *= 2;
                    }
                }
            }
        }
        return multipliedMatrix; // all zeros and I dont know why..
    }

    private static void printMatrix(int[][] matrix) { // this is work correctly
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}