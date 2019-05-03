package timeToString;

public class Time {

    private int day;
    private int month;
    private int year;

    public Time(int day, int month, int year) { // this allows us to define a date in our MainForTest class

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() { // everytime when we need a string representation program will use this toString method
        return String.format("%s/%s/%s", day, month, year);
    }
}