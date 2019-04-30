package timeToString;

public class Main {
    public static void main(String[] args) {
        Time timeObject = new Time(12, 5, 1991); // Object of Time
        Birthday birthdayObject = new Birthday("Martin", timeObject); // Object of Birthday

        System.out.println(birthdayObject);
    }
}