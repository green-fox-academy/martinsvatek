public class MultiDimensionalArrayTable {
    public static void main(String[] args) {

        int firstarray[][] = {{8, 9, 10, 11, 12}, {12, 13, 14, 15}};
        int secondtarray[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};

        System.out.println("First array:");
        readerArray(firstarray); //called method
        System.out.println("Second array:");
        readerArray(secondtarray); //called method
    }

    public static void readerArray(int array[][]) {

        for (int row = 0; row < array.length; row++) { //first has 2 length, second have 3 length
            for (int column = 0; column < array[row].length; column++) { //first has 5 and 4 length, second have 4, 1 and 3 length
                System.out.print(array[row][column] + "\t");
            }
            System.out.println();
        }
    }
}