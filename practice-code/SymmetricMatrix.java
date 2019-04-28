public class SymmetricMatrix {
    public static void main(String[] args) {

        int[][] symmetricMatrix =  {{1, 0, 1},
                                    {0, 2, 2},
                                    {1, 2, 5}};

        int[][] notSymmetricMatrix = {{1, 0, 3},
                                      {0, 2, 2},
                                      {1, 2, 5}};

        int[][] SymmetricMatrixTwo = {{1, 0, 3},
                                      {0, 2, 0},
                                      {1, 0, 1}};

        int[][] notSymmetricMatrixTwo = {{1, 0, 3},
                                         {0, 2, 2},
                                         {1, 2, 5}};

        System.out.println(isSymmetricFirst(symmetricMatrix));
        System.out.println(isSymmetricFirst(notSymmetricMatrix));

        System.out.println("- - - - -");

        System.out.println(isSymmetricSecond(SymmetricMatrixTwo));
        System.out.println(isSymmetricSecond(notSymmetricMatrixTwo));
    }

    public static boolean isSymmetricFirst(int[][] inputMatrix) { // for a static method you can't reach a nonstatic method (in this class has to be every method static)

        for (int i = 0; i < inputMatrix.length; i++) { // number of sub-arrays
            for (int j = 0; j < inputMatrix[i].length; j++) { //number of values in one sub-array
                if (inputMatrix[i][j] != inputMatrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSymmetricSecond (int[][] inputMatrix) { // for a static method you can't reach a nonstatic method (in this class has to be every method static)

        int index = inputMatrix.length - 1;

        for (int i = 0; i < inputMatrix.length; i++) { // number of sub-arrays
            for (int j = 0; j < inputMatrix[i].length; j++) { //number of values in one sub-array
                if (inputMatrix[i][j] != inputMatrix[index - j][index - i]) { // logic was to find a connection between values in array
                    return false;
                }
            }
        }
        return true;
    }
}