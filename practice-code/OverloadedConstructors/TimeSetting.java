package overloadedConstructors;

public class TimeSetting {

    private int hour;
    private int minute;
    private int second;

    // four constructors - depending on how much information I have
    public TimeSetting() { // first constructor with three 0 arguments
        this (0, 0, 0);
    }

    public TimeSetting(int h) { // second constructor
        this (h, 0, 0);
    }

    public TimeSetting(int h, int m) { // third constructor
        this (h, m, 0);
    }

    public TimeSetting(int h, int m, int s) { // fourth constructor
        setTime (h, m, s);
    }

    public void setTime(int h, int m, int s) {
        setHour (h);
        setMinute (m);
        setSecond (s);
    }

    public void setHour(int h) { // checking data of hour/change data
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) { // checking data of minute/change data
        minute = ((m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s) { // checking data of second/change data
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public int getHour() { // take hour from setHour and return this
        return hour;
    }

    public int getMinute() { // take minute from setMinute and return this
        return minute;
    }

    public int getSecond() { // take second from setSecond and return this
        return second;
    }

    public String setToMilitaryTimeFormat() {
        return String.format("%02d:%02d:%02d", hour, minute, second); // Output of integer values in 2 decimals, the first being zero if number less than or equal to 9
    }

    public String setAmericanTimeFormat() {
        return String.format("%2d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, ((hour < 12) ? "AM" : "PM"));
    }
}