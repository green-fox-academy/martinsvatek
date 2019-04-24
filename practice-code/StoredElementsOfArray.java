import java.util.Random;

public class StoredElementsOfArray {
    public static void main(String[] args) {

        Random random = new Random();
        int frequency[] = new int[7];

        for (int i = 0; i < 1000; i++) {
            frequency[1 + random.nextInt(6)]++; //border //1 + because dice dont have 0 on its side
        }

        System.out.println("Face\tFrequency");

        for (int i = 1; i < frequency.length; i++) { //from 1 because dice dont have 0 on its side
            System.out.println(i + "\t\t" +frequency[i]);
        }
    }
}