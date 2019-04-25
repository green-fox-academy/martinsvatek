import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> budget = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        sum(budget);
        lowest(budget);
        avarage(budget);
    }

    public static void sum(ArrayList<Integer> inputList) {
        int sum = 0;
        for (int items : inputList) {
            sum += items;
        }
        System.out.println("We have spent: " + sum);
    }

    public static void lowest(ArrayList<Integer> inputList) {

        Collections.sort(inputList);
        System.out.println("Lowest spending: " + inputList.get(0));
    }

    public static void avarage(ArrayList<Integer> inputList) {
        int sumTwo = 0;
        for (int items : inputList) {
            sumTwo += items;
        }
        System.out.println("Average spending for an item: " + sumTwo / inputList.size());
    }
}

// We are going to represent our expenses in a list containing integers.
    // Create a list with the following items.
        // 500, 1000, 1250, 175, 800 and 120
    // Create an application which solves the following problems.
        // How much did we spend?
        // Which was our greatest expense?
        // Which was our cheapest spending?
        // What was the average amount of our spendings?