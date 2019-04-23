import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {

    public static void main (String[] args) {

        ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);

        System.out.println(listA.contains("Durian"));

        System.out.println("- - - - -");

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        if (listA.size() > listB.size()) {
            System.out.println("List A is bigger");
        } else {
            System.out.println("List B is bigger");
        }

        System.out.println("- - - - -");

        System.out.println(listA.indexOf("Avocado"));

        System.out.println("- - - - -");

        System.out.println(listB.indexOf("Durian"));

        System.out.println("- - - - -");

        listB.addAll(Arrays.asList("Passion fruit","Pomelo"));

        System.out.println(listA.get(2));
    }
}