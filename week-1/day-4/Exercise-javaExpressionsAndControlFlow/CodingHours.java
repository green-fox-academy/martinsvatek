public class CodingHours {

    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        double hours = 6;
        double weeks = 17;
        double workDays = 5;
        double spent = hours * weeks * workDays;

        System.out.println(spent + " hours");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double weekly = 52;
        double percentage = (hours * workDays / weekly) * 100;

        System.out.println(percentage + " %");
    }
}