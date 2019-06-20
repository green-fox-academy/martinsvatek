import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main (String[] args) {

        // Create an empty list which will contain names (strings)

        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size());

        System.out.println("- - - - -");

        names.add("William");

        if (names.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }

        System.out.println("- - - - -");

        names.add ("John");
        names.add ("Amanda");

        System.out.println(names.size());

        System.out.println("- - - - -");

        System.out.println(names.get(2));

        System.out.println("- - - - -");

        for (String printedName : names) {
            System.out.println(printedName);
        }

        System.out.println("- - - - -");

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + "." + names.get(i));
        }

        System.out.println("- - - - -");

        names.remove(1);

        for (String printedName : names ) {
            System.out.println(printedName);
        }

        System.out.println("- - - - -");

        names.removeAll(names);
    }
}