public class CodingHours {
    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int hours = 6, weeks = 17, averange = 52, spent, average;
        spent = hours * weeks * 5;

        System.out.println(spent);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double weekly = 52, hours2 = 6, weeks2 = 17, percentage;
        percentage = (hours2 * 5 / weekly) * 100;

        System.out.println(percentage + " %");

    }
}
