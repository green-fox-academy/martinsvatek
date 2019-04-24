package TimeClock;

public class TimeSetting {

    private int hour; // Private variables without values
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
    }
    // when constructor has the same name as a class means that this constructor is called with object of class in main
    public TimeSetting(int hour, int minute, int second) { // when you want to set time in main
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeSetting() { // when you want to set it here
        this.hour = 4;
        this.minute = 5;
        this.second = 6;
    }

    public String setToMilitaryTimeFormat() {
        return String.format("%02d:%02d:%02d", hour, minute, second); // Output of integer values in 2 or more digits, the first being zero if number less than or equal to 9
    }

    public String setAmericanTimeFormat() {
        return String.format("%2d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, ((hour < 12) ? "AM" : "PM"));
    }
}