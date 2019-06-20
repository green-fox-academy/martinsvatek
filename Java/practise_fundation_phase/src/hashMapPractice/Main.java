package hashMapPractice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> firstMap = new HashMap<>();
        firstMap.put("Burger", 140);
        firstMap.put("Eggs", 5);
        firstMap.put("Ramen", 180);
        firstMap.put("Hrschikovicha", 20);

        HashMap<String, Integer> secondMap = new HashMap<>(); // Food and Produces
        secondMap.put("Burger", 140);
        secondMap.put("Eggs", 5);
        secondMap.put("Ramen", 180);
        secondMap.put("Hrschikovicha", 20);

        HashMap<Student, Integer> thirdMap = new HashMap<>(); // Student and Strength
        thirdMap.put(new Student(78, "SpiderMan", false), 70);

        int priceForRamen = firstMap.get("Ramen"); // get value for key

        int sum = 0;
        for (int price : firstMap.values()) {// looking in values
            sum += price;
        }
        double average = (double) sum / firstMap.size();
    }
}