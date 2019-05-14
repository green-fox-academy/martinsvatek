package foxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Fox> foxZoo = initializeZoo();

        List<Fox> greenFoxes = foxZoo.stream()
                .filter(fox -> fox.getColor() == "green")
                .collect(Collectors.toList());

        System.out.println(greenFoxes);

        List<Fox> greenFoxesYoungerThanFive = foxZoo.stream()
                .filter(fox -> fox.getColor() == "green" && fox.getAge() < 5)
                .collect(Collectors.toList());

        System.out.println(greenFoxesYoungerThanFive);

        Map<String, Integer> foxesGroupedByColor = foxZoo.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.summingInt(c -> 1)));

        System.out.println(foxesGroupedByColor);
    }

    private static List<Fox> initializeZoo() {

        List<Fox> foxCrowd = new ArrayList<Fox>();

        Fox fox1 = new Fox("FirstFox", "orange", 3);
        Fox fox2 = new Fox("SecondFox", "black", 8);
        Fox fox3 = new Fox("ThirdFox", "green", 6);
        Fox fox4 = new Fox("ForthFox", "red", 10);
        Fox fox5 = new Fox("FifthFox", "green", 4);
        Fox fox6 = new Fox("SixthFox", "orange", 12);

        foxCrowd.add(fox1);
        foxCrowd.add(fox2);
        foxCrowd.add(fox3);
        foxCrowd.add(fox4);
        foxCrowd.add(fox5);
        foxCrowd.add(fox6);

        return foxCrowd;
    }
}