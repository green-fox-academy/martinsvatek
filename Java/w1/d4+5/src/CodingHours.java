public class CodingHours {
    public static void main(String[] args) {

        int hoursPerDay = 6;
        int daysPerWeek = 5;
        int weeks = 17;

        int spentHours = hoursPerDay * daysPerWeek * weeks;
        double percentage = (double) 30 / (double) 52 * 100;

        System.out.println(spentHours);
        System.out.println(percentage + "%");
    }
}

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52