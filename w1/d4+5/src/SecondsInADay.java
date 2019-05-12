public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int amountOfCurrentSecondsPerDay = (currentHours * 3600) + (currentMinutes * 60) + currentSeconds;

        int dayHours = 24;
        int minutesPerHours = 60;
        int secondsPerMinute = 60;
        int amountOfSecondsPerDay = dayHours * minutesPerHours * secondsPerMinute;

        System.out.println(amountOfSecondsPerDay - amountOfCurrentSecondsPerDay + " Seconds are remaining");
    }
}

// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by the variables