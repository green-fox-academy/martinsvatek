public class DoubleItems {

    public static void main(String[] args) {

        int[] numList = {3, 4, 5, 6, 7};
        int doubler = 2;

        for (int i = 0; i < numList.length; i++) {
            numList[i] *= doubler;

            System.out.print(numList[i] + ", ");
        }
    }
}

// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array